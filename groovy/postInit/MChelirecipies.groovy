// SRP Manhunt: staged MCHeli CE progression.
// This file intentionally replaces every built-in MCHeli recipe so obsolete content-pack
// recipes cannot bypass the progression below.

def modid = 'mcheli'

crafting.streamRecipes()
    .filter { recipe ->
        def recipeId = recipe.getRegistryName()
        return recipeId != null && recipeId.getNamespace() == modid
    }
    .removeAll()

def shaped = { output, rows ->
    crafting.shapedBuilder()
        .output(output)
        .shape(rows)
        .register()
}

// Stable IDs already used by the rest of this Groovy pack.
def steel = item('thermalfoundation:material', 160)
def invar = item('thermalfoundation:material', 162)
def enderium = item('thermalfoundation:material', 167)
def aluminiumPlate = item('thermalfoundation:material', 328)

def iron = item('minecraft:iron_ingot')
def ironBlock = item('minecraft:iron_block')
def redstone = item('minecraft:redstone')
def redstoneBlock = item('minecraft:redstone_block')
def gunpowder = item('minecraft:gunpowder')
def diamond = item('minecraft:diamond')
def diamondBlock = item('minecraft:diamond_block')
def quartz = item('minecraft:quartz')
def blazeRod = item('minecraft:blaze_rod')
def netherBrick = item('minecraft:netherbrick')
def netherStar = item('minecraft:nether_star')

def trophyLow = item('srparasites:lurecomponent2')
def trophyHigh = item('srparasites:lurecomponent4')
def livingCore = item('srparasites:living_core')
def vileShell = item('srparasites:vile_shell')

// -----------------------------------------------------------------------------
// Workshop parts and basic logistics: no diamonds, Nether or End materials.
// -----------------------------------------------------------------------------

shaped(item('mcheli:wrench'), [
    [iron, null, iron],
    [null, iron, null],
    [null, iron, null]
])

shaped(item('mcheli:chain'), [
    [iron, null, iron],
    [iron, iron, iron],
    [iron, null, iron]
])

shaped(item('mcheli:container'), [
    [iron, item('minecraft:chest'), iron],
    [iron, null, iron],
    [iron, iron, iron]
])

shaped(item('mcheli:drafting_table'), [
    [redstone, item('minecraft:paper'), redstone],
    [item('minecraft:planks'), item('minecraft:crafting_table'), item('minecraft:planks')],
    [item('minecraft:fence'), null, item('minecraft:fence')]
])

shaped(item('mcheli:parachute'), [
    [item('minecraft:wool'), item('minecraft:wool'), item('minecraft:wool')],
    [item('minecraft:string'), null, item('minecraft:string')],
    [null, item('minecraft:wool'), null]
])

shaped(item('mcheli:uav_pairing_device'), [
    [iron, redstone, iron],
    [redstone, item('minecraft:comparator'), redstone],
    [iron, item('minecraft:repeater'), iron]
])

shaped(item('mcheli:uav_station2'), [
    [steel, item('minecraft:glass_pane'), steel],
    [redstone, item('mcheli:uav_pairing_device'), redstone],
    [iron, item('minecraft:lever'), iron]
])

// Ten fuel cans per bucket keeps routine logistics affordable without making vehicles free.
shaped(item('mcheli:fuel') * 10, [
    [null, iron, null],
    [iron, item('forge:bucketfilled').withNbt(['FluidName': 'refined_fuel', 'Amount': 1000]), iron],
    [null, iron, null]
])

shaped(item('mcheli:fuel') * 10, [
    [null, steel, null],
    [steel, item('forge:bucketfilled').withNbt(['FluidName': 'refined_biofuel', 'Amount': 1000]), steel],
    [null, steel, null]
])

// -----------------------------------------------------------------------------
// EARLY TIER: reconnaissance, light platforms and simple artillery.
// -----------------------------------------------------------------------------

shaped(item('mcheli:12.7'), [
    [iron, steel, iron],
    [gunpowder, item('minecraft:dispenser'), gunpowder],
    [iron, redstone, iron]
])

shaped(item('mcheli:15.5'), [
    [steel, ironBlock, steel],
    [gunpowder, item('minecraft:piston'), gunpowder],
    [ironBlock, redstone, ironBlock]
])

shaped(item('mcheli:skylark'), [
    [aluminiumPlate, redstone, aluminiumPlate],
    [item('minecraft:feather'), item('mcheli:uav_pairing_device'), item('minecraft:feather')],
    [iron, item('minecraft:comparator'), iron]
])

shaped(item('mcheli:rc-goblin'), [
    [null, steel, null],
    [item('minecraft:feather'), item('mcheli:uav_pairing_device'), item('minecraft:feather')],
    [iron, redstoneBlock, iron]
])

shaped(item('mcheli:cessna172'), [
    [aluminiumPlate, item('minecraft:glass_pane'), aluminiumPlate],
    [iron, item('minecraft:minecart'), iron],
    [steel, redstone, steel]
])

shaped(item('mcheli:growler'), [
    [iron, item('minecraft:glass_pane'), iron],
    [steel, item('mcheli:container'), steel],
    [item('minecraft:minecart'), redstone, item('minecraft:minecart')]
])

shaped(item('mcheli:bofors40mml60'), [
    [steel, ironBlock, steel],
    [gunpowder, item('mcheli:12.7'), gunpowder],
    [ironBlock, item('minecraft:piston'), ironBlock]
])

// -----------------------------------------------------------------------------
// MIDDLE TIER: diamonds, Nether components and trophies from dangerous parasites.
// Every vehicle grows from an earlier chassis instead of being crafted from loose ingots.
// -----------------------------------------------------------------------------

shaped(item('mcheli:uav_station'), [
    [invar, diamond, invar],
    [redstoneBlock, item('mcheli:uav_station2'), redstoneBlock],
    [quartz, trophyLow, quartz]
])

shaped(item('mcheli:m1129'), [
    [invar, diamond, invar],
    [netherBrick, item('mcheli:15.5'), netherBrick],
    [steel, trophyLow, steel]
])

shaped(item('mcheli:t-90'), [
    [diamond, invar, diamond],
    [blazeRod, item('mcheli:growler'), blazeRod],
    [netherBrick, trophyHigh, netherBrick]
])

shaped(item('mcheli:ka50n'), [
    [aluminiumPlate, diamond, aluminiumPlate],
    [invar, item('mcheli:rc-goblin'), invar],
    [blazeRod, trophyLow, blazeRod]
])

shaped(item('mcheli:a-10'), [
    [aluminiumPlate, diamond, aluminiumPlate],
    [invar, item('mcheli:cessna172'), invar],
    [gunpowder, trophyLow, gunpowder]
])

shaped(item('mcheli:mig29'), [
    [diamond, aluminiumPlate, diamond],
    [blazeRod, item('mcheli:a-10'), blazeRod],
    [invar, trophyHigh, invar]
])

shaped(item('mcheli:mq-8b'), [
    [aluminiumPlate, diamond, aluminiumPlate],
    [quartz, item('mcheli:skylark'), quartz],
    [invar, trophyLow, invar]
])

shaped(item('mcheli:mim-23'), [
    [invar, diamond, invar],
    [blazeRod, item('mcheli:bofors40mml60'), blazeRod],
    [redstoneBlock, trophyHigh, redstoneBlock]
])

// Portable anti-air and anti-tank launchers are middle tier; their guided missiles are end tier.
shaped(item('mcheli:fim92'), [
    [invar, item('minecraft:glass'), quartz],
    [diamond, blazeRod, redstoneBlock],
    [null, trophyLow, null]
])

shaped(item('mcheli:fgm148'), [
    [quartz, item('minecraft:glass'), invar],
    [redstoneBlock, blazeRod, diamond],
    [null, trophyHigh, null]
])

// -----------------------------------------------------------------------------
// END TIER: reinforced UAVs, heavy aviation, advanced armour, missiles and guidance.
// Enderium is intentionally absent from every early and middle vehicle recipe above.
// -----------------------------------------------------------------------------

shaped(item('mcheli:rangefinder'), [
    [invar, enderium, invar],
    [redstoneBlock, item('minecraft:glass'), redstoneBlock],
    [quartz, livingCore, quartz]
])

shaped(item('mcheli:gltd'), [
    [enderium, item('mcheli:rangefinder'), enderium],
    [diamondBlock, redstoneBlock, diamondBlock],
    [invar, livingCore, invar]
])

shaped(item('mcheli:uav_tablet'), [
    [enderium, item('minecraft:glass_pane'), enderium],
    [redstoneBlock, item('mcheli:uav_station2'), redstoneBlock],
    [diamond, livingCore, diamond]
])

shaped(item('mcheli:mq-9'), [
    [enderium, diamondBlock, enderium],
    [invar, item('mcheli:mq-8b'), invar],
    [livingCore, redstoneBlock, livingCore]
])

shaped(item('mcheli:x-47b'), [
    [enderium, netherStar, enderium],
    [diamondBlock, item('mcheli:mq-9'), diamondBlock],
    [livingCore, item('mcheli:uav_tablet'), livingCore]
])

shaped(item('mcheli:f22a'), [
    [enderium, netherStar, enderium],
    [aluminiumPlate, item('mcheli:mig29'), aluminiumPlate],
    [diamondBlock, livingCore, diamondBlock]
])

shaped(item('mcheli:f-35b'), [
    [enderium, diamondBlock, enderium],
    [livingCore, item('mcheli:f22a'), livingCore],
    [invar, item('mcheli:gltd'), invar]
])

shaped(item('mcheli:b-2a'), [
    [enderium, netherStar, enderium],
    [diamondBlock, item('mcheli:f22a'), diamondBlock],
    [vileShell, livingCore, vileShell]
])

shaped(item('mcheli:ah-64'), [
    [enderium, diamondBlock, enderium],
    [invar, item('mcheli:ka50n'), invar],
    [vileShell, item('mcheli:rangefinder'), vileShell]
])

shaped(item('mcheli:m1a2'), [
    [enderium, diamondBlock, enderium],
    [vileShell, item('mcheli:t-90'), vileShell],
    [invar, livingCore, invar]
])

shaped(item('mcheli:merkava_mk4'), [
    [enderium, enderium, enderium],
    [diamondBlock, item('mcheli:m1a2'), diamondBlock],
    [vileShell, netherStar, vileShell]
])

shaped(item('mcheli:krupp_c_34'), [
    [enderium, ironBlock, enderium],
    [vileShell, item('mcheli:15.5'), vileShell],
    [diamondBlock, livingCore, diamondBlock]
])

shaped(item('mcheli:searam'), [
    [enderium, item('mcheli:rangefinder'), enderium],
    [diamondBlock, item('mcheli:mim-23'), diamondBlock],
    [livingCore, netherStar, livingCore]
])

// One Enderium ingot per improved missile. Artillery consumes one Enderium ingot directly
// per accepted server-side shot; that guaranteed cost is enforced by the companion hotfix.
shaped(item('mcheli:fim92_bullet'), [
    [null, enderium, null],
    [null, blazeRod, null],
    [null, gunpowder, null]
])

shaped(item('mcheli:fgm148_bullet'), [
    [enderium, null, null],
    [null, blazeRod, null],
    [null, null, gunpowder]
])
