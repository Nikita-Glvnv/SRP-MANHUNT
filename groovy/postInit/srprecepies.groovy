crafting.shapedBuilder()
    .output(item('minecraft:rabbit_hide'))
    .shape([
    [item('srparasites:assimilated_flesh'), item('srparasites:assimilated_flesh'), null],
    [item('srparasites:assimilated_flesh'), item('srparasites:assimilated_flesh'), null],
    [null, null, null]
])
    .register()
	
crafting.shapedBuilder()
    .output(item('minecraft:leather'))
    .shape([
    [item('srparasites:assimilated_flesh'), item('srparasites:assimilated_flesh'), null],
    [item('srparasites:assimilated_flesh'), item('srparasites:assimilated_flesh'), null],
    [null, null, null]
])
    .register()

crafting.shapedBuilder()
    .output(item('minecraft:emerald'))
    .shape([
    [item('srparasites:beckon_drop'), item('srparasites:beckon_drop'), null],
    [item('srparasites:beckon_drop'), item('srparasites:beckon_drop'), null],
    [null, null, null]
])
    .register()

crafting.shapedBuilder()
    .output(item('srparasites:armor_helm'))
    .shape([
    [item('srparasites:vile_shell'), item('srparasites:living_core'), item('srparasites:vile_shell')],
    [item('srparasites:vile_shell'), null, item('srparasites:vile_shell')],
    [null, null, null]
])
    .register()

crafting.shapedBuilder()
    .output(item('srparasites:armor_chest'))
    .shape([
    [item('srparasites:vile_shell'), null, item('srparasites:vile_shell')],
    [item('srparasites:vile_shell'), item('srparasites:living_core'), item('srparasites:vile_shell')],
    [item('srparasites:vile_shell'),item('srparasites:vile_shell'), item('srparasites:vile_shell')]
])
    .register()

crafting.shapedBuilder()
    .output(item('srparasites:armor_pants'))
    .shape([
    [item('srparasites:vile_shell'), item('srparasites:living_core'), item('srparasites:vile_shell')],
    [item('srparasites:vile_shell'), null, item('srparasites:vile_shell')],
    [item('srparasites:vile_shell'), null, item('srparasites:vile_shell')]
])
    .register()
	
crafting.shapedBuilder()
    .output(item('srparasites:armor_boots'))
    .shape([
    [null, item('srparasites:living_core'), null],
    [item('srparasites:dispatcher_drop'), null, item('srparasites:dispatcher_drop')],
    [item('srparasites:vile_shell'), null, item('srparasites:vile_shell')]
])
    .register()

crafting.shapedBuilder()
    .output(item('srparasites:armor_helm_sentient'))
    .shape([
    [item('nocubessrparmory:dreadnaughtcore'),item('srpcotesia:vigilant_bone'), item('nocubessrparmory:dreadnaughtcore')],
    [item('nocubessrparmory:dreadnaughtcore'), item('srparasites:armor_helm'), item('nocubessrparmory:dreadnaughtcore')],
    [null, null, null]
])
    .register()

crafting.shapedBuilder()
    .output(item('srparasites:armor_chest_sentient'))
    .shape([
    [item('nocubessrparmory:overlordcore'), item('srparasites:armor_chest'), item('nocubessrparmory:overlordcore')],
    [item('nocubessrparmory:overlordcore'), item('srpcotesia:vigilant_bone'), item('nocubessrparmory:overlordcore')],
    [item('nocubessrparmory:overlordcore'), item('nocubessrparmory:overlordcore'), item('nocubessrparmory:overlordcore')]
])
    .register()

crafting.shapedBuilder()
    .output(item('srparasites:armor_pants_sentient'))
    .shape([
    [item('nocubessrparmory:dreadnaughtcore'), item('srpcotesia:vigilant_bone'), item('nocubessrparmory:dreadnaughtcore')],
    [item('nocubessrparmory:dreadnaughtcore'), item('srparasites:armor_pants'), item('nocubessrparmory:dreadnaughtcore')],
    [item('nocubessrparmory:dreadnaughtcore'), null, item('nocubessrparmory:dreadnaughtcore')]
])
    .register()
	
crafting.shapedBuilder()
    .output(item('srparasites:armor_boots_sentient'))
    .shape([
    [null, item('srpcotesia:vigilant_bone'), null],
    [item('srparasites:dispatcher_drop'), item('srparasites:armor_boots'), item('srparasites:dispatcher_drop')],
    [item('nocubessrparmory:dreadnaughtcore'), null, item('nocubessrparmory:dreadnaughtcore')]
])
    .register()
	
crafting.shapedBuilder()
    .output(item('srparasites:evolutionlure', 6))
    .shape([
    [item('srparasites:itemthrow'), item('srparasites:biomeheart'), item('srparasites:itemthrow')],
    [item('srparasites:biomepurifier'), item('minecraft:nether_star'), item('srparasites:biomepurifier')],
    [item('srparasites:itemthrow'), item('srparasites:colonyheart'), item('srparasites:itemthrow')]
])
    .register()
	
