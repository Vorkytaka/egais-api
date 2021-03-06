package ru.evotor.egais.api.query

import android.database.Cursor
import ru.evotor.egais.api.model.dictionary.ProductInfo
import ru.evotor.egais.api.model.dictionary.ProductType
import ru.evotor.egais.api.provider.dictionary.ProductInfoContract

internal fun Cursor.createProductInfo(): ProductInfo {
    val columnIndexType = this.getColumnIndex(ProductInfoContract.COLUMN_TYPE)
    val columnIndexFullName = this.getColumnIndex(ProductInfoContract.COLUMN_FULL_NAME)
    val columnIndexShortName = this.getColumnIndex(ProductInfoContract.COLUMN_SHORT_NAME)
    val columnIndexAlcCode = this.getColumnIndex(ProductInfoContract.COLUMN_ALC_CODE)
    val columnIndexCapacity = this.getColumnIndex(ProductInfoContract.COLUMN_CAPACITY)
    val columnIndexAlcVolume = this.getColumnIndex(ProductInfoContract.COLUMN_ALC_VOLUME)
    val columnIndexProducerId = this.getColumnIndex(ProductInfoContract.COLUMN_PRODUCER_CLIENT_REG_ID)
    val columnIndexImporterId = this.getColumnIndex(ProductInfoContract.COLUMN_IMPORTER_CLIENT_REG_ID)
    val columnIndexProductVCode = this.getColumnIndex(ProductInfoContract.COLUMN_PRODUCT_V_CODE)

    return ProductInfo(
            ProductType.valueOf(this.getString(columnIndexType)),
            this.getString(columnIndexFullName),
            this.getString(columnIndexShortName),
            this.getString(columnIndexAlcCode),
            this.getString(columnIndexCapacity),
            this.getString(columnIndexAlcVolume),
            this.getString(columnIndexProducerId),
            this.getString(columnIndexImporterId),
            this.getString(columnIndexProductVCode)
    )
}