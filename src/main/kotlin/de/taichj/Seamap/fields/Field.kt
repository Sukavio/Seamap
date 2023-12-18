package de.taichj.Seamap.fields

data class Field(var x: Int, var y: Int, var z: Int, var type: FIELD_TYPE)

enum class FIELD_TYPE {SEA, ISLAND}