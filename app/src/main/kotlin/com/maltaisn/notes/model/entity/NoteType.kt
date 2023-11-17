
package com.maltaisn.notes.model.entity

import com.maltaisn.notes.model.ValueEnum
import com.maltaisn.notes.model.findValueEnum

enum class NoteType(override val value: Int) : ValueEnum<Int> {
    TEXT(0),
    LIST(1);

    companion object {
        fun fromValue(value: Int): NoteType = findValueEnum(value)
    }
}
