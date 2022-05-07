package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import org.openapitools.model.BoardOwner
import javax.validation.constraints.DecimalMax
import javax.validation.constraints.DecimalMin
import javax.validation.constraints.Max
import javax.validation.constraints.Min
import javax.validation.constraints.NotNull
import javax.validation.constraints.Pattern
import javax.validation.constraints.Size
import javax.validation.Valid

/**
 * Board
 * @param name 
 * @param id 
 * @param description 
 * @param owner 
 * @param privacy Privacy setting for a board. Learn more about <a href=\"https://help.pinterest.com/en/article/secret-boards\">secret boards</a> and <a href=\"https://help.pinterest.com/en/business/article/protected-boards\">protected boards</a>
 */
data class Board(

    @field:JsonProperty("name", required = true) val name: kotlin.String,

    @field:JsonProperty("id") val id: kotlin.String? = null,

    @field:JsonProperty("description") val description: kotlin.String? = null,

    @field:Valid
    @field:JsonProperty("owner") val owner: BoardOwner? = null,

    @field:JsonProperty("privacy") val privacy: Board.Privacy? = Privacy.pUBLIC
) {

    /**
    * Privacy setting for a board. Learn more about <a href=\"https://help.pinterest.com/en/article/secret-boards\">secret boards</a> and <a href=\"https://help.pinterest.com/en/business/article/protected-boards\">protected boards</a>
    * Values: pUBLIC,pROTECTED,sECRET
    */
    enum class Privacy(val value: kotlin.String) {
    
        @JsonProperty("PUBLIC") pUBLIC("PUBLIC"),
    
        @JsonProperty("PROTECTED") pROTECTED("PROTECTED"),
    
        @JsonProperty("SECRET") sECRET("SECRET");
    
    }

}

