package com.lyrebirdstudio.fileboxlib.recorder

import com.lyrebirdstudio.fileboxlib.core.Record


internal interface RecordMapper<MappedRecord> {

    fun mapTo(record: Record): MappedRecord

    fun mapFrom(mappedRecord: MappedRecord): Record
}