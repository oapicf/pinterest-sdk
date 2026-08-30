package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonValue
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import javax.validation.constraints.DecimalMax
import javax.validation.constraints.DecimalMin
import javax.validation.constraints.Email
import javax.validation.constraints.Max
import javax.validation.constraints.Min
import javax.validation.constraints.NotNull
import javax.validation.constraints.Pattern
import javax.validation.constraints.Size
import javax.validation.Valid
import io.swagger.v3.oas.annotations.media.Schema

/**
* L1 interest categories for filtering trends.
* Values: animals,architecture,art,beauty,childrens_fashion,design,diy_and_crafts,education,electronics,entertainment,event_planning,finance,food_and_drinks,gardening,health,home_decor,mens_fashion,parenting,quotes,sport,travel,vehicles,wedding,womens_fashion
*/
enum class TrendsL1Interest(@get:JsonValue val value: kotlin.String) {

    animals("animals"),
    architecture("architecture"),
    art("art"),
    beauty("beauty"),
    childrens_fashion("childrens_fashion"),
    design("design"),
    diy_and_crafts("diy_and_crafts"),
    education("education"),
    electronics("electronics"),
    entertainment("entertainment"),
    event_planning("event_planning"),
    finance("finance"),
    food_and_drinks("food_and_drinks"),
    gardening("gardening"),
    health("health"),
    home_decor("home_decor"),
    mens_fashion("mens_fashion"),
    parenting("parenting"),
    quotes("quotes"),
    sport("sport"),
    travel("travel"),
    vehicles("vehicles"),
    wedding("wedding"),
    womens_fashion("womens_fashion");

    companion object {
        @JvmStatic
        @JsonCreator
        fun forValue(value: kotlin.String): TrendsL1Interest {
                return values().firstOrNull{it -> it.value == value}
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'TrendsL1Interest'")
        }
    }
}

