def dtk = [
    [null, null, null],
    [item('thermalfoundation:material', 324), item('thermalfoundation:material', 324), item('minecraft:iron_ingot')],
    [null, null, null]
]

def plamegas = [
    [null, null, null],
    [item('thermalfoundation:material', 352), item('thermalfoundation:material', 352), item('minecraft:iron_ingot')],
    [null, null, null]
]

def compensator = [
    [null, null, null],
    [item('thermalfoundation:material', 352), item('thermalfoundation:material', 352), item('minecraft:iron_ingot')],
    [null, null, null]
]

def glushitel = [
    [null, null, null],
    [item('thermalfoundation:material', 133), item('thermalfoundation:material', 133), item('thermalfoundation:material', 133)],
    [null, null, null]
]

def rucoyatka = [
    [null, item('thermalfoundation:material', 134), item('thermalfoundation:material', 134)],
    [null, item('thermalfoundation:material', 163), item('thermalfoundation:material', 163)],
    [null, null, item('thermalfoundation:material', 163)]
]

def derevoloje = [
    [item('minecraft:iron_ingot'), item('minecraft:leather'), item('minecraft:leather')],
    [item('minecraft:iron_ingot'), item('thermalfoundation:material', 324), item('thermalfoundation:material', 324)],
    [null, null, null]
]

def loje = [
    [item('thermalfoundation:material', 160), item('minecraft:planks'), item('minecraft:planks')],
    [item('thermalfoundation:material', 160), item('minecraft:planks'), item('minecraft:planks')],
    [null, null, null]
]

def lightstock = [
    [item('thermalfoundation:material', 324), item('thermalfoundation:material', 324), item('thermalfoundation:material', 324)],
    [item('thermalfoundation:material', 324), item('thermalfoundation:material', 164), item('thermalfoundation:material', 324)],
    [null, null, null]
]

def stock = [
    [item('thermalfoundation:material', 325), item('thermalfoundation:material', 161), item('thermalfoundation:material', 325)],
    [item('thermalfoundation:material', 325), item('thermalfoundation:material', 161), item('thermalfoundation:material', 325)],
    [null, null, null]
]

def kolim = [
    [null, item('modularwarfare:lev.binlen'), null],
    [null, item('thermalfoundation:material', 324), item('thermalfoundation:material', 324)],
    [null, null, null]
]

def scope = [
    [item('modularwarfare:lev.binlen'), item('modularwarfare:lev.binlen'), null],
    [item('thermalfoundation:material', 353), item('thermalfoundation:material', 353), null],
    [null, null, null]
]

def laser = [
    [null, item('modularwarfare:lev.binlen'), item('thermalfoundation:material', 134)],
    [null, item('thermalfoundation:material', 33), item('thermalfoundation:material', 33)],
    [null, null, null]
]

crafting.shapedBuilder()
    .output(item('modularwarfare:lev.binlen'))
    .shape([
    [null, item('minecraft:iron_ingot'), null],
    [null, item('minecraft:glass_pane'), null],
    [null, item('minecraft:iron_ingot'), null]
])
    .register()
	
crafting.shapedBuilder()
    .output(item('modularwarfare:lev.kos'))
    .shape(dtk)
    .register()
	
crafting.shapedBuilder()
    .output(item('modularwarfare:lev.dtk1'))
    .shape(dtk)
    .register()

crafting.shapedBuilder()
    .output(item('modularwarfare:lev.svdmcomp'))
    .shape(dtk)
    .register()
	
crafting.shapedBuilder()
    .output(item('modularwarfare:lev.svdcomp'))
    .shape(dtk)
    .register()

crafting.shapedBuilder()
    .output(item('modularwarfare:lev.sv98comp'))
    .shape(dtk)
    .register()
	
crafting.shapedBuilder()
    .output(item('modularwarfare:lev.hk417comp'))
    .shape(plamegas)
    .register()
	
crafting.shapedBuilder()
    .output(item('modularwarfare:lev.lwdfh'))
    .shape(plamegas)
    .register()
	
crafting.shapedBuilder()
    .output(item('modularwarfare:lev.sa583p'))
    .shape(plamegas)
    .register()

crafting.shapedBuilder()
    .output(item('modularwarfare:lev.akfh'))
    .shape(plamegas)
    .register()
	
crafting.shapedBuilder()
    .output(item('modularwarfare:lev.m4comp'))
    .shape(plamegas)
    .register()
	
crafting.shapedBuilder()
    .output(item('modularwarfare:lev.mp7comp'))
    .shape(plamegas)
    .register()
	
crafting.shapedBuilder()
    .output(item('modularwarfare:lev.lantacbmd'))
    .shape(plamegas)
    .register()
	
crafting.shapedBuilder()
    .output(item('modularwarfare:lev.rpkcomp'))
    .shape(compensator)
    .register()
	
crafting.shapedBuilder()
    .output(item('modularwarfare:lev.ashcomp'))
    .shape(compensator)
    .register()
	
crafting.shapedBuilder()
    .output(item('modularwarfare:lev.rpk16comp'))
    .shape(compensator)
    .register()
	
crafting.shapedBuilder()
    .output(item('modularwarfare:lev.ak308comp'))
    .shape(compensator)
    .register()
	
crafting.shapedBuilder()
    .output(item('modularwarfare:lev.f2000comp'))
    .shape(compensator)
    .register()
	
crafting.shapedBuilder()
    .output(item('modularwarfare:lev.pbs1'))
    .shape(compensator)
    .register()	
	
crafting.shapedBuilder()
    .output(item('modularwarfare:lev.bulletecst'))
    .shape(compensator)
    .register()
	
crafting.shapedBuilder()
    .output(item('modularwarfare:lev.lantacdragon'))
    .shape(compensator)
    .register()
	
crafting.shapedBuilder()
    .output(item('modularwarfare:lev.ak762comp'))
    .shape(compensator)
    .register()
	
crafting.shapedBuilder()
    .output(item('modularwarfare:lev.pkcomp'))
    .shape(compensator)
    .register()
	
crafting.shapedBuilder()
    .output(item('modularwarfare:lev.scarhcomp'))
    .shape(compensator)
    .register()
	
crafting.shapedBuilder()
    .output(item('modularwarfare:lev.ak545comp'))
    .shape(compensator)
    .register()
	
crafting.shapedBuilder()
    .output(item('modularwarfare:lev.m82comp'))
    .shape(compensator)
    .register()
	
crafting.shapedBuilder()
    .output(item('modularwarfare:lev.scarlcomp'))
    .shape(compensator)
    .register()
	
crafting.shapedBuilder()
    .output(item('modularwarfare:lev.kedrbsup'))
    .shape(glushitel)
    .register()
	
crafting.shapedBuilder()
    .output(item('modularwarfare:lev.sr2_sup'))
    .shape(glushitel)
    .register()
	
crafting.shapedBuilder()
    .output(item('modularwarfare:lev.sr3msup'))
    .shape(glushitel)
    .register()
	
crafting.shapedBuilder()
    .output(item('modularwarfare:lev.svdsup'))
    .shape(glushitel)
    .register()
	
crafting.shapedBuilder()
    .output(item('modularwarfare:lev.ospreysup'))
    .shape(glushitel)
    .register()
	
crafting.shapedBuilder()
    .output(item('modularwarfare:lev.mp7sup'))
    .shape(glushitel)
    .register()
	
crafting.shapedBuilder()
    .output(item('modularwarfare:lev.supkac556'))
    .shape(glushitel)
    .register()
	
crafting.shapedBuilder()
    .output(item('modularwarfare:lev.brtsup'))
    .shape(glushitel)
    .register()
	
crafting.shapedBuilder()
    .output(item('modularwarfare:lev.ak12sup'))
    .shape(glushitel)
    .register()
	
crafting.shapedBuilder()
    .output(item('modularwarfare:lev.6p69sup'))
    .shape(glushitel)
    .register()
	
crafting.shapedBuilder()
    .output(item('modularwarfare:lev.sr1_sup'))
    .shape(glushitel)
    .register()
	
crafting.shapedBuilder()
    .output(item('modularwarfare:lev.ashsup'))
    .shape(glushitel)
    .register()
	
crafting.shapedBuilder()
    .output(item('modularwarfare:lev.apb'))
    .shape(glushitel)
    .register()
	
crafting.shapedBuilder()
    .output(item('modularwarfare:lev.waffle'))
    .shape(glushitel)
    .register()
	
crafting.shapedBuilder()
    .output(item('modularwarfare:lev.supkac76251'))
    .shape(glushitel)
    .register()
	
crafting.shapedBuilder()
    .output(item('modularwarfare:lev.uzisup'))
    .shape(glushitel)
    .register()
	
crafting.shapedBuilder()
    .output(item('modularwarfare:lev.grozasup'))
    .shape(glushitel)
    .register()
	
crafting.shapedBuilder()
    .output(item('modularwarfare:lev.rk6'))
    .shape(rucoyatka)
    .register()
	
crafting.shapedBuilder()
    .output(item('modularwarfare:lev.sturmgriff_fde'))
    .shape(rucoyatka)
    .register()

crafting.shapedBuilder()
    .output(item('modularwarfare:lev.afg'))
    .shape(rucoyatka)
    .register()
	
crafting.shapedBuilder()
    .output(item('modularwarfare:lev.uvg'))
    .shape(rucoyatka)
    .register()
	
crafting.shapedBuilder()
    .output(item('modularwarfare:lev.rk0'))
    .shape(rucoyatka)
    .register()
	
crafting.shapedBuilder()
    .output(item('modularwarfare:lev.afg_fde'))
    .shape(rucoyatka)
    .register()
	
crafting.shapedBuilder()
    .output(item('modularwarfare:lev.grozagrip'))
    .shape(rucoyatka)
    .register()
	
crafting.shapedBuilder()
    .output(item('modularwarfare:lev.tommy_grip'))
    .shape(rucoyatka)
    .register()
	
crafting.shapedBuilder()
    .output(item('modularwarfare:lev.sturmgriff'))
    .shape(rucoyatka)
    .register()
	
crafting.shapedBuilder()
    .output(item('modularwarfare:lev.se5'))
    .shape(rucoyatka)
    .register()
	
crafting.shapedBuilder()
    .output(item('modularwarfare:lev.fortis_shift'))
    .shape(rucoyatka)
    .register()
	
crafting.shapedBuilder()
    .output(item('modularwarfare:lev.rk2'))
    .shape(rucoyatka)
    .register()
	
crafting.shapedBuilder()
    .output(item('modularwarfare:lev.svd2'))
    .shape(derevoloje)
    .register()
	
crafting.shapedBuilder()
    .output(item('modularwarfare:lev.tommy_stock'))
    .shape(derevoloje)
    .register()
	
crafting.shapedBuilder()
    .output(item('modularwarfare:lev.apsstock'))
    .shape(derevoloje)
    .register()
	
crafting.shapedBuilder()
    .output(item('modularwarfare:lev.p08stock'))
    .shape(derevoloje)
    .register()
	
crafting.shapedBuilder()
    .output(item('modularwarfare:lev.rpkstock'))
    .shape(derevoloje)
    .register()
	
crafting.shapedBuilder()
    .output(item('modularwarfare:lev.akstockd'))
    .shape(derevoloje)
    .register()
	
crafting.shapedBuilder()
    .output(item('modularwarfare:lev.m700ataics'))
    .shape(loje)
    .register()

crafting.shapedBuilder()
    .output(item('modularwarfare:lev.m700promagarch'))
    .shape(loje)
    .register()
	
crafting.shapedBuilder()
    .output(item('modularwarfare:lev.sv98m'))
    .shape(loje)
    .register()
	
crafting.shapedBuilder()
    .output(item('modularwarfare:lev.m700promagarchfde'))
    .shape(loje)
    .register()
	
crafting.shapedBuilder()
    .output(item('modularwarfare:lev.kedrbstock'))
    .shape(lightstock)
    .register()
	
crafting.shapedBuilder()
    .output(item('modularwarfare:lev.mp5lstock'))
    .shape(lightstock)
    .register()
	
crafting.shapedBuilder()
    .output(item('modularwarfare:lev.apsstockl'))
    .shape(lightstock)
    .register()
	
crafting.shapedBuilder()
    .output(item('modularwarfare:lev.kedrstock'))
    .shape(lightstock)
    .register()
	
crafting.shapedBuilder()
    .output(item('modularwarfare:lev.sa58lstock'))
    .shape(lightstock)
    .register()
	
crafting.shapedBuilder()
    .output(item('modularwarfare:lev.valstock'))
    .shape(lightstock)
    .register()
	
crafting.shapedBuilder()
    .output(item('modularwarfare:lev.akstockl'))
    .shape(lightstock)
    .register()
	
crafting.shapedBuilder()
    .output(item('modularwarfare:lev.mp5stock'))
    .shape(lightstock)
    .register()
	
crafting.shapedBuilder()
    .output(item('modularwarfare:lev.mp5f5stock'))
    .shape(lightstock)
    .register()
	
crafting.shapedBuilder()
    .output(item('modularwarfare:lev.ak12stock3'))
    .shape(lightstock)
    .register()
	
crafting.shapedBuilder()
    .output(item('modularwarfare:lev.pt1stock'))
    .shape(lightstock)
    .register()
	
crafting.shapedBuilder()
    .output(item('modularwarfare:lev.prs3stock'))
    .shape(stock)
    .register()
	
crafting.shapedBuilder()
    .output(item('modularwarfare:lev.g3stock'))
    .shape(stock)
    .register()
	
crafting.shapedBuilder()
    .output(item('modularwarfare:lev.g28stock'))
    .shape(stock)
    .register()
	
crafting.shapedBuilder()
    .output(item('modularwarfare:lev.pernachstock'))
    .shape(stock)
    .register()
	
crafting.shapedBuilder()
    .output(item('modularwarfare:lev.svdp'))
    .shape(stock)
    .register()
	
crafting.shapedBuilder()
    .output(item('modularwarfare:lev.hk416stockh'))
    .shape(stock)
    .register()
	
crafting.shapedBuilder()
    .output(item('modularwarfare:lev.svdsstock'))
    .shape(stock)
    .register()
	
crafting.shapedBuilder()
    .output(item('modularwarfare:lev.ak12stock1'))
    .shape(stock)
    .register()
	
crafting.shapedBuilder()
    .output(item('modularwarfare:lev.prs3stockfde'))
    .shape(stock)
    .register()
	
crafting.shapedBuilder()
    .output(item('modularwarfare:lev.svdmstock'))
    .shape(stock)
    .register()
	
crafting.shapedBuilder()
    .output(item('modularwarfare:lev.g28stockfde'))
    .shape(stock)
    .register()
	
crafting.shapedBuilder()
    .output(item('modularwarfare:lev.akstockp'))
    .shape(stock)
    .register()
	
crafting.shapedBuilder()
    .output(item('modularwarfare:lev.scarstock'))
    .shape(stock)
    .register()
	
crafting.shapedBuilder()
    .output(item('modularwarfare:lev.m4stock'))
    .shape(stock)
    .register()
	
crafting.shapedBuilder()
    .output(item('modularwarfare:lev.hk416stock'))
    .shape(stock)
    .register()
	
crafting.shapedBuilder()
    .output(item('modularwarfare:lev.rpk74stock'))
    .shape(stock)
    .register()
	
crafting.shapedBuilder()
    .output(item('modularwarfare:lev.krissstock'))
    .shape(stock)
    .register()
	
crafting.shapedBuilder()
    .output(item('modularwarfare:lev.m4sopmodstock'))
    .shape(stock)
    .register()
	
crafting.shapedBuilder()
    .output(item('modularwarfare:lev.deltapoint'))
    .shape(kolim)
    .register()
	
crafting.shapedBuilder()
    .output(item('modularwarfare:lev.sr2msing'))
    .shape(kolim)
    .register()
	
crafting.shapedBuilder()
    .output(item('modularwarfare:lev.eotech'))
    .shape(kolim)
    .register()
	
crafting.shapedBuilder()
    .output(item('modularwarfare:lev.okp'))
    .shape(kolim)
    .register()
	
crafting.shapedBuilder()
    .output(item('modularwarfare:lev.okplh'))
    .shape(kolim)
    .register()
	
crafting.shapedBuilder()
    .output(item('modularwarfare:lev.microh2'))
    .shape(kolim)
    .register()
	
crafting.shapedBuilder()
    .output(item('modularwarfare:lev.microh1'))
    .shape(kolim)
    .register()
	
crafting.shapedBuilder()
    .output(item('modularwarfare:lev.barska'))
    .shape(kolim)
    .register()
	
crafting.shapedBuilder()
    .output(item('modularwarfare:lev.fnf2000optic'))
    .shape(kolim)
    .register()
	
crafting.shapedBuilder()
    .output(item('modularwarfare:lev.klesh'))
    .shape(laser)
    .register()
	
crafting.shapedBuilder()
    .output(item('modularwarfare:lev.perst3'))
    .shape(laser)
    .register()
	
crafting.shapedBuilder()
    .output(item('modularwarfare:lev.pu'))
    .shape(scope)
    .register()
	
crafting.shapedBuilder()
    .output(item('modularwarfare:lev.elcan'))
    .shape(scope)
    .register()
	
crafting.shapedBuilder()
    .output(item('modularwarfare:lev.sbrpm_fde'))
    .shape(scope)
    .register()
	
crafting.shapedBuilder()
    .output(item('modularwarfare:lev.sbrpm'))
    .shape(scope)
    .register()
	
crafting.shapedBuilder()
    .output(item('modularwarfare:lev.pso11'))
    .shape(scope)
    .register()
	
crafting.shapedBuilder()
    .output(item('modularwarfare:lev.pso'))
    .shape(scope)
    .register()
	
crafting.shapedBuilder()
    .output(item('modularwarfare:lev.mtprism'))
    .shape(scope)
    .register()
	
crafting.shapedBuilder()
    .output(item('modularwarfare:lev.z24'))
    .shape(scope)
    .register()
	
crafting.shapedBuilder()
    .output(item('modularwarfare:lev.vudu'))
    .shape(scope)
    .register()
	
crafting.shapedBuilder()
    .output(item('modularwarfare:lev.4x34'))
    .shape(scope)
    .register()
	
crafting.shapedBuilder()
    .output(item('modularwarfare:lev.nightforce'))
    .shape(scope)
    .register()
	
crafting.shapedBuilder()
    .output(item('modularwarfare:lev.rakurs'))
    .shape(scope)
    .register()
	
crafting.shapedBuilder()
    .output(item('modularwarfare:lev.pgo7v'))
    .shape(scope)
    .register()
	
crafting.shapedBuilder()
    .output(item('modularwarfare:lev.valday'))
    .shape(scope)
    .register()