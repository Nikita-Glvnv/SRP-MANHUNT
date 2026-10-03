crafting.shapedBuilder()
    .output(item('thermalfoundation:glass'))
    .shape([
    [null, item('minecraft:glass'), null],
    [null, item('thermalfoundation:material', 128), null],
    [null, item('thermalfoundation:material', 1024), null]
])
    .register()
