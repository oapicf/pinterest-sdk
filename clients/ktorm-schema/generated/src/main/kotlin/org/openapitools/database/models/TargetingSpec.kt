/**
* Pinterest REST API
* Pinterest's REST API
*
* The version of the OpenAPI document: 5.12.0
* Contact: blah+oapicf@cliffano.com
*
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
* https://openapi-generator.tech
* Do not edit the class manually.
*/
package org.openapitools.database.models

import org.ktorm.dsl.*
import org.ktorm.schema.*
import org.ktorm.database.Database
import .*


/**
 * Ad group targeting specification defining the ad group target audience. For example, {\"APPTYPE\":[\"iphone\"], \"GENDER\":[\"male\"], \"LOCALE\":[\"en-US\"], \"LOCATION\":[\"501\"], \"AGE_BUCKET\":[\"25-34\"]}
 * @param AGE_BUCKET Age ranges. If the AGE_BUCKET field is missing, the default behavior in terms of ad delivery is that **All age buckets** will be targeted.
 * @param APPTYPE Allowed devices. If the APPTYPE field is missing, the default behavior in terms of ad delivery is that **All devices/apptypes** will be targeted.
 * @param AUDIENCE_EXCLUDE Excluded customer list IDs. Used to drive new customer acquisition goals. For example: [\"2542620905475\"]. Audience lists need to have at least 100 people with Pinterest accounts in them. If the AUDIENCE_EXCLUDE field is missing, the default behavior in terms of ad delivery is that **No users will be excluded**.
 * @param auDIENCEINCLUDEQuote Targeted customer list IDs. For example: [\"2542620905473\"]. Audience lists need to have at least 100 people with Pinterest accounts in them Audience lists need to have at least 100 people with Pinterest accounts in them. If the AUDIENCE_INCLUDE field is missing, the default behavior in terms of ad delivery is that **All users will be included**.
 * @param GENDER Targeted genders. Values: [\"unknown\",\"male\",\"female\"]. If the GENDER field is missing, the default behavior in terms of ad delivery is that **All genders will be targeted**.
 * @param GEO Location region codes, e.g., \"BE-VOV\" (East Flanders, Belgium) For complete list, <a href=\"https://help.pinterest.com/sub/helpcenter/partner/pinterest_location_targeting_codes.xlsx\" target=\"_blank\">click here</a> or postal codes, e.g., \"US-94107\". Use either region codes or postal codes but not both. If the GEO field is missing, the default behavior in terms of ad delivery is that **No geos will be selected**.
 * @param INTEREST Array of interest object IDs. If the INTEREST field is missing, the default behavior in terms of ad delivery is that **All interests will be targeted**.
 * @param LOCALE 24 ISO 639-1 two letter language codes. If the LOCALE field is missing, the default behavior in terms of ad delivery is that **All languages will be target, only english non-sublanguage will be targeted**.
 * @param LOCATION 22 ISO Alpha 2 two letter country codes or US Nielsen DMA (Designated Market Area) codes (location region codes) (e.g., [\"US\", \"807\"]). For complete list, click here. Location-Country and Location-Metro codes apply. If the LOCATION field is missing, the default behavior in terms of ad delivery is that **Selects default country if not specified (US) and all regions within that country**.
 * @param SHOPPING_RETARGETING Array of object: lookback_window [Integer]: Number of days ago to start lookback timeframe for dynamic retargeting tag_types [Array of integer]: Event types to target for dynamic retargeting exclusion_window [Integer]: Number of days ago to stop lookback timeframe for dynamic retargeting
 * @param TARGETING_STRATEGY 
 */
object TargetingSpecs : BaseTable<TargetingSpec>("TargetingSpec") {

    /**
     * Create an entity of type TargetingSpec from the model
     */
    override fun doCreateEntity(row: QueryRowSet, withReferences: Boolean) = TargetingSpec(
        AGE_BUCKET = emptyList() /* kotlin.Array<kotlin.String>? */ /* Age ranges. If the AGE_BUCKET field is missing, the default behavior in terms of ad delivery is that **All age buckets** will be targeted. */,
        APPTYPE = emptyList() /* kotlin.Array<kotlin.String>? */ /* Allowed devices. If the APPTYPE field is missing, the default behavior in terms of ad delivery is that **All devices/apptypes** will be targeted. */,
        AUDIENCE_EXCLUDE = emptyList() /* kotlin.Array<kotlin.String>? */ /* Excluded customer list IDs. Used to drive new customer acquisition goals. For example: [\"2542620905475\"]. Audience lists need to have at least 100 people with Pinterest accounts in them. If the AUDIENCE_EXCLUDE field is missing, the default behavior in terms of ad delivery is that **No users will be excluded**. */,
        auDIENCEINCLUDEQuote = emptyList() /* kotlin.Array<kotlin.String>? */ /* Targeted customer list IDs. For example: [\"2542620905473\"]. Audience lists need to have at least 100 people with Pinterest accounts in them Audience lists need to have at least 100 people with Pinterest accounts in them. If the AUDIENCE_INCLUDE field is missing, the default behavior in terms of ad delivery is that **All users will be included**. */,
        GENDER = emptyList() /* kotlin.Array<kotlin.String>? */ /* Targeted genders. Values: [\"unknown\",\"male\",\"female\"]. If the GENDER field is missing, the default behavior in terms of ad delivery is that **All genders will be targeted**. */,
        GEO = emptyList() /* kotlin.Array<kotlin.String>? */ /* Location region codes, e.g., \"BE-VOV\" (East Flanders, Belgium) For complete list, <a href=\"https://help.pinterest.com/sub/helpcenter/partner/pinterest_location_targeting_codes.xlsx\" target=\"_blank\">click here</a> or postal codes, e.g., \"US-94107\". Use either region codes or postal codes but not both. If the GEO field is missing, the default behavior in terms of ad delivery is that **No geos will be selected**. */,
        INTEREST = emptyList() /* kotlin.Array<kotlin.String>? */ /* Array of interest object IDs. If the INTEREST field is missing, the default behavior in terms of ad delivery is that **All interests will be targeted**. */,
        LOCALE = emptyList() /* kotlin.Array<kotlin.String>? */ /* 24 ISO 639-1 two letter language codes. If the LOCALE field is missing, the default behavior in terms of ad delivery is that **All languages will be target, only english non-sublanguage will be targeted**. */,
        LOCATION = emptyList() /* kotlin.Array<kotlin.String>? */ /* 22 ISO Alpha 2 two letter country codes or US Nielsen DMA (Designated Market Area) codes (location region codes) (e.g., [\"US\", \"807\"]). For complete list, click here. Location-Country and Location-Metro codes apply. If the LOCATION field is missing, the default behavior in terms of ad delivery is that **Selects default country if not specified (US) and all regions within that country**. */,
        SHOPPING_RETARGETING = emptyList() /* kotlin.Array<TargetingSpecSHOPPINGRETARGETING>? */ /* Array of object: lookback_window [Integer]: Number of days ago to start lookback timeframe for dynamic retargeting tag_types [Array of integer]: Event types to target for dynamic retargeting exclusion_window [Integer]: Number of days ago to stop lookback timeframe for dynamic retargeting */,
        TARGETING_STRATEGY = emptyList() /* kotlin.Array<kotlin.String>? */ /*  */
    )

    /**
    * Assign all the columns from the entity of type TargetingSpec to the DML expression.
    *
    * Usage:
    *
    * ```kotlin
    * let entity = TargetingSpec()
    * database.update(TargetingSpecs, {
    *     assignFrom(entity)
    * })
    * ```
    * @return the builder with the columns for the update or insert.
    */
    fun AssignmentsBuilder.assignFrom(entity: TargetingSpec) {
        this.apply {
        }
    }

}


object TargetingSpecAGEBUCKET : BaseTable<Pair<kotlin.Long, kotlin.String>>("TargetingSpecAGEBUCKET") {
    val targetingSpec = long("targetingSpec")
    val aGEBUCKET = text("aGEBUCKET")

    override fun doCreateEntity(row: QueryRowSet, withReferences: Boolean): Pair<kotlin.Long, kotlin.String> =
        Pair(row[targetingSpec] ?: 0, row[aGEBUCKET] ?: "")

    fun AssignmentsBuilder.assignFrom(entity: Pair<kotlin.Long, kotlin.String>) {
        this.apply {
            set(TargetingSpecAGEBUCKET.targetingSpec, entity.first)
            set(TargetingSpecAGEBUCKET.aGEBUCKET, entity.second)
        }
    }

}

object TargetingSpecAPPTYPE : BaseTable<Pair<kotlin.Long, kotlin.String>>("TargetingSpecAPPTYPE") {
    val targetingSpec = long("targetingSpec")
    val aPPTYPE = text("aPPTYPE")

    override fun doCreateEntity(row: QueryRowSet, withReferences: Boolean): Pair<kotlin.Long, kotlin.String> =
        Pair(row[targetingSpec] ?: 0, row[aPPTYPE] ?: "")

    fun AssignmentsBuilder.assignFrom(entity: Pair<kotlin.Long, kotlin.String>) {
        this.apply {
            set(TargetingSpecAPPTYPE.targetingSpec, entity.first)
            set(TargetingSpecAPPTYPE.aPPTYPE, entity.second)
        }
    }

}

object TargetingSpecAUDIENCEEXCLUDE : BaseTable<Pair<kotlin.Long, kotlin.String>>("TargetingSpecAUDIENCEEXCLUDE") {
    val targetingSpec = long("targetingSpec")
    val aUDIENCEEXCLUDE = text("aUDIENCEEXCLUDE")

    override fun doCreateEntity(row: QueryRowSet, withReferences: Boolean): Pair<kotlin.Long, kotlin.String> =
        Pair(row[targetingSpec] ?: 0, row[aUDIENCEEXCLUDE] ?: "")

    fun AssignmentsBuilder.assignFrom(entity: Pair<kotlin.Long, kotlin.String>) {
        this.apply {
            set(TargetingSpecAUDIENCEEXCLUDE.targetingSpec, entity.first)
            set(TargetingSpecAUDIENCEEXCLUDE.aUDIENCEEXCLUDE, entity.second)
        }
    }

}

object TargetingSpecAuDIENCEINCLUDEQuote : BaseTable<Pair<kotlin.Long, kotlin.String>>("TargetingSpecAuDIENCEINCLUDEQuote") {
    val targetingSpec = long("targetingSpec")
    val auDIENCEINCLUDEQuote = text("auDIENCEINCLUDEQuote")

    override fun doCreateEntity(row: QueryRowSet, withReferences: Boolean): Pair<kotlin.Long, kotlin.String> =
        Pair(row[targetingSpec] ?: 0, row[auDIENCEINCLUDEQuote] ?: "")

    fun AssignmentsBuilder.assignFrom(entity: Pair<kotlin.Long, kotlin.String>) {
        this.apply {
            set(TargetingSpecAuDIENCEINCLUDEQuote.targetingSpec, entity.first)
            set(TargetingSpecAuDIENCEINCLUDEQuote.auDIENCEINCLUDEQuote, entity.second)
        }
    }

}

object TargetingSpecGENDER : BaseTable<Pair<kotlin.Long, kotlin.String>>("TargetingSpecGENDER") {
    val targetingSpec = long("targetingSpec")
    val gENDER = text("gENDER")

    override fun doCreateEntity(row: QueryRowSet, withReferences: Boolean): Pair<kotlin.Long, kotlin.String> =
        Pair(row[targetingSpec] ?: 0, row[gENDER] ?: "")

    fun AssignmentsBuilder.assignFrom(entity: Pair<kotlin.Long, kotlin.String>) {
        this.apply {
            set(TargetingSpecGENDER.targetingSpec, entity.first)
            set(TargetingSpecGENDER.gENDER, entity.second)
        }
    }

}

object TargetingSpecGEO : BaseTable<Pair<kotlin.Long, kotlin.String>>("TargetingSpecGEO") {
    val targetingSpec = long("targetingSpec")
    val gEO = text("gEO")

    override fun doCreateEntity(row: QueryRowSet, withReferences: Boolean): Pair<kotlin.Long, kotlin.String> =
        Pair(row[targetingSpec] ?: 0, row[gEO] ?: "")

    fun AssignmentsBuilder.assignFrom(entity: Pair<kotlin.Long, kotlin.String>) {
        this.apply {
            set(TargetingSpecGEO.targetingSpec, entity.first)
            set(TargetingSpecGEO.gEO, entity.second)
        }
    }

}

object TargetingSpecINTEREST : BaseTable<Pair<kotlin.Long, kotlin.String>>("TargetingSpecINTEREST") {
    val targetingSpec = long("targetingSpec")
    val iNTEREST = text("iNTEREST")

    override fun doCreateEntity(row: QueryRowSet, withReferences: Boolean): Pair<kotlin.Long, kotlin.String> =
        Pair(row[targetingSpec] ?: 0, row[iNTEREST] ?: "")

    fun AssignmentsBuilder.assignFrom(entity: Pair<kotlin.Long, kotlin.String>) {
        this.apply {
            set(TargetingSpecINTEREST.targetingSpec, entity.first)
            set(TargetingSpecINTEREST.iNTEREST, entity.second)
        }
    }

}

object TargetingSpecLOCALE : BaseTable<Pair<kotlin.Long, kotlin.String>>("TargetingSpecLOCALE") {
    val targetingSpec = long("targetingSpec")
    val lOCALE = text("lOCALE")

    override fun doCreateEntity(row: QueryRowSet, withReferences: Boolean): Pair<kotlin.Long, kotlin.String> =
        Pair(row[targetingSpec] ?: 0, row[lOCALE] ?: "")

    fun AssignmentsBuilder.assignFrom(entity: Pair<kotlin.Long, kotlin.String>) {
        this.apply {
            set(TargetingSpecLOCALE.targetingSpec, entity.first)
            set(TargetingSpecLOCALE.lOCALE, entity.second)
        }
    }

}

object TargetingSpecLOCATION : BaseTable<Pair<kotlin.Long, kotlin.String>>("TargetingSpecLOCATION") {
    val targetingSpec = long("targetingSpec")
    val lOCATION = text("lOCATION")

    override fun doCreateEntity(row: QueryRowSet, withReferences: Boolean): Pair<kotlin.Long, kotlin.String> =
        Pair(row[targetingSpec] ?: 0, row[lOCATION] ?: "")

    fun AssignmentsBuilder.assignFrom(entity: Pair<kotlin.Long, kotlin.String>) {
        this.apply {
            set(TargetingSpecLOCATION.targetingSpec, entity.first)
            set(TargetingSpecLOCATION.lOCATION, entity.second)
        }
    }

}

object TargetingSpecTargetingSpecSHOPPINGRETARGETING : BaseTable<Pair<kotlin.Long, kotlin.Long>>("TargetingSpecTargetingSpecSHOPPINGRETARGETING") {
    val targetingSpec = long("targetingSpec")
    val targetingSpecSHOPPINGRETARGETING = long("targetingSpecSHOPPINGRETARGETING")

    override fun doCreateEntity(row: QueryRowSet, withReferences: Boolean): Pair<kotlin.Long, kotlin.Long> =
        Pair(row[targetingSpec] ?: 0, row[targetingSpecSHOPPINGRETARGETING] ?: 0)

    fun AssignmentsBuilder.assignFrom(entity: Pair<kotlin.Long, kotlin.Long>) {
        this.apply {
            set(TargetingSpecTargetingSpecSHOPPINGRETARGETING.targetingSpec, entity.first)
            set(TargetingSpecTargetingSpecSHOPPINGRETARGETING.targetingSpecSHOPPINGRETARGETING, entity.second)
        }
    }

}

object TargetingSpecTARGETINGSTRATEGY : BaseTable<Pair<kotlin.Long, kotlin.String>>("TargetingSpecTARGETINGSTRATEGY") {
    val targetingSpec = long("targetingSpec")
    val tARGETINGSTRATEGY = text("tARGETINGSTRATEGY")

    override fun doCreateEntity(row: QueryRowSet, withReferences: Boolean): Pair<kotlin.Long, kotlin.String> =
        Pair(row[targetingSpec] ?: 0, row[tARGETINGSTRATEGY] ?: "")

    fun AssignmentsBuilder.assignFrom(entity: Pair<kotlin.Long, kotlin.String>) {
        this.apply {
            set(TargetingSpecTARGETINGSTRATEGY.targetingSpec, entity.first)
            set(TargetingSpecTARGETINGSTRATEGY.tARGETINGSTRATEGY, entity.second)
        }
    }

}
