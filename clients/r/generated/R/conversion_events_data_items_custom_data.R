#' Create a new ConversionEventsDataItemsCustomData
#'
#' @description
#' Object containing other custom data.
#'
#' @docType class
#' @title ConversionEventsDataItemsCustomData
#' @description ConversionEventsDataItemsCustomData Class
#' @format An \code{R6Class} generator object
#' @field content_brand The brand of the content associated with the event. character [optional]
#' @field content_category The category of the content associated with the event. character [optional]
#' @field content_ids List of products IDs. We recommend using this if you are a merchant for PageVisit, AddToCart and Checkouts. For detail, please check [here](https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs) (Install the Pinterest tag section). list(character) [optional]
#' @field content_name The name of the page or product associated with the event. character [optional]
#' @field contents A list of objects containing information about products, such as price and quantity. We recommend using this if you are a merchant for PageVisit, AddToCart and Checkouts. For detail, please check [here](https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs) (Install the Pinterest tag section). list(\link{ConversionEventsDataItemsCustomDataContentsItems}) [optional]
#' @field currency The ISO-4217 currency code. If not provided, we will default to the advertiser's currency set during account creation. Your campaign performance needs this field to report right ROAS/CPA. character [optional]
#' @field external_measurement_id Only use when instructed. character [optional]
#' @field external_measurement_vendor_id Only use when instructed. integer [optional]
#' @field np Named partner. Not required, this is for Pinterest internal use only. Please do not use this unless specifically guided. character [optional]
#' @field num_items Total number of products of the event. For example, the total number of items purchased in a checkout event. We recommend using this if you are a merchant for AddToCart and Checkouts. For detail, please check [here](https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs) (Install the Pinterest tag section). integer [optional]
#' @field opt_out_type Flags for different privacy rights laws to opt out users of sharing personal information. Separate values with commas. See the Help Center article about [limited data processing](https://help.pinterest.com/en/business/article/limited-data-processing) and the developer's guide for [tracking conversion events](/docs/track-conversions/track-conversions-in-the-api/#whether-the-user-has-opted-out-of-web-or-offline-conversion-events) for help with using this parameter. character [optional]
#' @field order_id The order ID. We recommend sending order_id to help us deduplicate events when necessary. This also helps to run other measurement products at Pinterest. character [optional]
#' @field predicted_ltv Predicted lifetime value of user associated with the event. Accepted as a string in the request; it will be parsed into a double. character [optional]
#' @field search_string The search string related to the user conversion event. character [optional]
#' @field value Total value of the event. Accepted as a string in the request; it will be parsed into a double. For example, if there are two items in a checkout event, the value should be the total price. We recommend to use pre-tax, pre-shipping final value. character [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
ConversionEventsDataItemsCustomData <- R6::R6Class(
  "ConversionEventsDataItemsCustomData",
  public = list(
    `content_brand` = NULL,
    `content_category` = NULL,
    `content_ids` = NULL,
    `content_name` = NULL,
    `contents` = NULL,
    `currency` = NULL,
    `external_measurement_id` = NULL,
    `external_measurement_vendor_id` = NULL,
    `np` = NULL,
    `num_items` = NULL,
    `opt_out_type` = NULL,
    `order_id` = NULL,
    `predicted_ltv` = NULL,
    `search_string` = NULL,
    `value` = NULL,

    #' @description
    #' Initialize a new ConversionEventsDataItemsCustomData class.
    #'
    #' @param content_brand The brand of the content associated with the event.
    #' @param content_category The category of the content associated with the event.
    #' @param content_ids List of products IDs. We recommend using this if you are a merchant for PageVisit, AddToCart and Checkouts. For detail, please check [here](https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs) (Install the Pinterest tag section).
    #' @param content_name The name of the page or product associated with the event.
    #' @param contents A list of objects containing information about products, such as price and quantity. We recommend using this if you are a merchant for PageVisit, AddToCart and Checkouts. For detail, please check [here](https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs) (Install the Pinterest tag section).
    #' @param currency The ISO-4217 currency code. If not provided, we will default to the advertiser's currency set during account creation. Your campaign performance needs this field to report right ROAS/CPA.
    #' @param external_measurement_id Only use when instructed.
    #' @param external_measurement_vendor_id Only use when instructed.
    #' @param np Named partner. Not required, this is for Pinterest internal use only. Please do not use this unless specifically guided.
    #' @param num_items Total number of products of the event. For example, the total number of items purchased in a checkout event. We recommend using this if you are a merchant for AddToCart and Checkouts. For detail, please check [here](https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs) (Install the Pinterest tag section).
    #' @param opt_out_type Flags for different privacy rights laws to opt out users of sharing personal information. Separate values with commas. See the Help Center article about [limited data processing](https://help.pinterest.com/en/business/article/limited-data-processing) and the developer's guide for [tracking conversion events](/docs/track-conversions/track-conversions-in-the-api/#whether-the-user-has-opted-out-of-web-or-offline-conversion-events) for help with using this parameter.
    #' @param order_id The order ID. We recommend sending order_id to help us deduplicate events when necessary. This also helps to run other measurement products at Pinterest.
    #' @param predicted_ltv Predicted lifetime value of user associated with the event. Accepted as a string in the request; it will be parsed into a double.
    #' @param search_string The search string related to the user conversion event.
    #' @param value Total value of the event. Accepted as a string in the request; it will be parsed into a double. For example, if there are two items in a checkout event, the value should be the total price. We recommend to use pre-tax, pre-shipping final value.
    #' @param ... Other optional arguments.
    initialize = function(`content_brand` = NULL, `content_category` = NULL, `content_ids` = NULL, `content_name` = NULL, `contents` = NULL, `currency` = NULL, `external_measurement_id` = NULL, `external_measurement_vendor_id` = NULL, `np` = NULL, `num_items` = NULL, `opt_out_type` = NULL, `order_id` = NULL, `predicted_ltv` = NULL, `search_string` = NULL, `value` = NULL, ...) {
      if (!is.null(`content_brand`)) {
        if (!(is.character(`content_brand`) && length(`content_brand`) == 1)) {
          stop(paste("Error! Invalid data for `content_brand`. Must be a string:", `content_brand`))
        }
        self$`content_brand` <- `content_brand`
      }
      if (!is.null(`content_category`)) {
        if (!(is.character(`content_category`) && length(`content_category`) == 1)) {
          stop(paste("Error! Invalid data for `content_category`. Must be a string:", `content_category`))
        }
        self$`content_category` <- `content_category`
      }
      if (!is.null(`content_ids`)) {
        stopifnot(is.vector(`content_ids`), length(`content_ids`) != 0)
        sapply(`content_ids`, function(x) stopifnot(is.character(x)))
        self$`content_ids` <- `content_ids`
      }
      if (!is.null(`content_name`)) {
        if (!(is.character(`content_name`) && length(`content_name`) == 1)) {
          stop(paste("Error! Invalid data for `content_name`. Must be a string:", `content_name`))
        }
        self$`content_name` <- `content_name`
      }
      if (!is.null(`contents`)) {
        stopifnot(is.vector(`contents`), length(`contents`) != 0)
        sapply(`contents`, function(x) stopifnot(R6::is.R6(x)))
        self$`contents` <- `contents`
      }
      if (!is.null(`currency`)) {
        if (!(is.character(`currency`) && length(`currency`) == 1)) {
          stop(paste("Error! Invalid data for `currency`. Must be a string:", `currency`))
        }
        self$`currency` <- `currency`
      }
      if (!is.null(`external_measurement_id`)) {
        if (!(is.character(`external_measurement_id`) && length(`external_measurement_id`) == 1)) {
          stop(paste("Error! Invalid data for `external_measurement_id`. Must be a string:", `external_measurement_id`))
        }
        self$`external_measurement_id` <- `external_measurement_id`
      }
      if (!is.null(`external_measurement_vendor_id`)) {
        if (!(is.numeric(`external_measurement_vendor_id`) && length(`external_measurement_vendor_id`) == 1)) {
          stop(paste("Error! Invalid data for `external_measurement_vendor_id`. Must be an integer:", `external_measurement_vendor_id`))
        }
        self$`external_measurement_vendor_id` <- `external_measurement_vendor_id`
      }
      if (!is.null(`np`)) {
        if (!(is.character(`np`) && length(`np`) == 1)) {
          stop(paste("Error! Invalid data for `np`. Must be a string:", `np`))
        }
        self$`np` <- `np`
      }
      if (!is.null(`num_items`)) {
        if (!(is.numeric(`num_items`) && length(`num_items`) == 1)) {
          stop(paste("Error! Invalid data for `num_items`. Must be an integer:", `num_items`))
        }
        self$`num_items` <- `num_items`
      }
      if (!is.null(`opt_out_type`)) {
        if (!(is.character(`opt_out_type`) && length(`opt_out_type`) == 1)) {
          stop(paste("Error! Invalid data for `opt_out_type`. Must be a string:", `opt_out_type`))
        }
        self$`opt_out_type` <- `opt_out_type`
      }
      if (!is.null(`order_id`)) {
        if (!(is.character(`order_id`) && length(`order_id`) == 1)) {
          stop(paste("Error! Invalid data for `order_id`. Must be a string:", `order_id`))
        }
        self$`order_id` <- `order_id`
      }
      if (!is.null(`predicted_ltv`)) {
        if (!(is.character(`predicted_ltv`) && length(`predicted_ltv`) == 1)) {
          stop(paste("Error! Invalid data for `predicted_ltv`. Must be a string:", `predicted_ltv`))
        }
        self$`predicted_ltv` <- `predicted_ltv`
      }
      if (!is.null(`search_string`)) {
        if (!(is.character(`search_string`) && length(`search_string`) == 1)) {
          stop(paste("Error! Invalid data for `search_string`. Must be a string:", `search_string`))
        }
        self$`search_string` <- `search_string`
      }
      if (!is.null(`value`)) {
        if (!(is.character(`value`) && length(`value`) == 1)) {
          stop(paste("Error! Invalid data for `value`. Must be a string:", `value`))
        }
        self$`value` <- `value`
      }
    },

    #' @description
    #' Convert to an R object. This method is deprecated. Use `toSimpleType()` instead.
    toJSON = function() {
      .Deprecated(new = "toSimpleType", msg = "Use the '$toSimpleType()' method instead since that is more clearly named. Use '$toJSONString()' to get a JSON string")
      return(self$toSimpleType())
    },

    #' @description
    #' Convert to a List
    #'
    #' Convert the R6 object to a list to work more easily with other tooling.
    #'
    #' @return ConversionEventsDataItemsCustomData as a base R list.
    #' @examples
    #' # convert array of ConversionEventsDataItemsCustomData (x) to a data frame
    #' \dontrun{
    #' library(purrr)
    #' library(tibble)
    #' df <- x |> map(\(y)y$toList()) |> map(as_tibble) |> list_rbind()
    #' df
    #' }
    toList = function() {
      return(self$toSimpleType())
    },

    #' @description
    #' Convert ConversionEventsDataItemsCustomData to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      ConversionEventsDataItemsCustomDataObject <- list()
      if (!is.null(self$`content_brand`)) {
        ConversionEventsDataItemsCustomDataObject[["content_brand"]] <-
          self$`content_brand`
      }
      if (!is.null(self$`content_category`)) {
        ConversionEventsDataItemsCustomDataObject[["content_category"]] <-
          self$`content_category`
      }
      if (!is.null(self$`content_ids`)) {
        ConversionEventsDataItemsCustomDataObject[["content_ids"]] <-
          self$`content_ids`
      }
      if (!is.null(self$`content_name`)) {
        ConversionEventsDataItemsCustomDataObject[["content_name"]] <-
          self$`content_name`
      }
      if (!is.null(self$`contents`)) {
        ConversionEventsDataItemsCustomDataObject[["contents"]] <-
          self$extractSimpleType(self$`contents`)
      }
      if (!is.null(self$`currency`)) {
        ConversionEventsDataItemsCustomDataObject[["currency"]] <-
          self$`currency`
      }
      if (!is.null(self$`external_measurement_id`)) {
        ConversionEventsDataItemsCustomDataObject[["external_measurement_id"]] <-
          self$`external_measurement_id`
      }
      if (!is.null(self$`external_measurement_vendor_id`)) {
        ConversionEventsDataItemsCustomDataObject[["external_measurement_vendor_id"]] <-
          self$`external_measurement_vendor_id`
      }
      if (!is.null(self$`np`)) {
        ConversionEventsDataItemsCustomDataObject[["np"]] <-
          self$`np`
      }
      if (!is.null(self$`num_items`)) {
        ConversionEventsDataItemsCustomDataObject[["num_items"]] <-
          self$`num_items`
      }
      if (!is.null(self$`opt_out_type`)) {
        ConversionEventsDataItemsCustomDataObject[["opt_out_type"]] <-
          self$`opt_out_type`
      }
      if (!is.null(self$`order_id`)) {
        ConversionEventsDataItemsCustomDataObject[["order_id"]] <-
          self$`order_id`
      }
      if (!is.null(self$`predicted_ltv`)) {
        ConversionEventsDataItemsCustomDataObject[["predicted_ltv"]] <-
          self$`predicted_ltv`
      }
      if (!is.null(self$`search_string`)) {
        ConversionEventsDataItemsCustomDataObject[["search_string"]] <-
          self$`search_string`
      }
      if (!is.null(self$`value`)) {
        ConversionEventsDataItemsCustomDataObject[["value"]] <-
          self$`value`
      }
      return(ConversionEventsDataItemsCustomDataObject)
    },

    extractSimpleType = function(x) {
      if (R6::is.R6(x)) {
        return(x$toSimpleType())
      } else if (!self$hasNestedR6(x)) {
        return(x)
      }
      lapply(x, self$extractSimpleType)
    },

    hasNestedR6 = function(x) {
      if (R6::is.R6(x)) {
        return(TRUE)
      }
      if (is.list(x)) {
        for (item in x) {
          if (self$hasNestedR6(item)) {
            return(TRUE)
          }
        }
      }
      FALSE
    },

    #' @description
    #' Deserialize JSON string into an instance of ConversionEventsDataItemsCustomData
    #'
    #' @param input_json the JSON input
    #' @return the instance of ConversionEventsDataItemsCustomData
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`content_brand`)) {
        self$`content_brand` <- this_object$`content_brand`
      }
      if (!is.null(this_object$`content_category`)) {
        self$`content_category` <- this_object$`content_category`
      }
      if (!is.null(this_object$`content_ids`)) {
        self$`content_ids` <- ApiClient$new()$deserializeObj(this_object$`content_ids`, "array[character]", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`content_name`)) {
        self$`content_name` <- this_object$`content_name`
      }
      if (!is.null(this_object$`contents`)) {
        self$`contents` <- ApiClient$new()$deserializeObj(this_object$`contents`, "array[ConversionEventsDataItemsCustomDataContentsItems]", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`currency`)) {
        self$`currency` <- this_object$`currency`
      }
      if (!is.null(this_object$`external_measurement_id`)) {
        self$`external_measurement_id` <- this_object$`external_measurement_id`
      }
      if (!is.null(this_object$`external_measurement_vendor_id`)) {
        self$`external_measurement_vendor_id` <- this_object$`external_measurement_vendor_id`
      }
      if (!is.null(this_object$`np`)) {
        self$`np` <- this_object$`np`
      }
      if (!is.null(this_object$`num_items`)) {
        self$`num_items` <- this_object$`num_items`
      }
      if (!is.null(this_object$`opt_out_type`)) {
        self$`opt_out_type` <- this_object$`opt_out_type`
      }
      if (!is.null(this_object$`order_id`)) {
        self$`order_id` <- this_object$`order_id`
      }
      if (!is.null(this_object$`predicted_ltv`)) {
        self$`predicted_ltv` <- this_object$`predicted_ltv`
      }
      if (!is.null(this_object$`search_string`)) {
        self$`search_string` <- this_object$`search_string`
      }
      if (!is.null(this_object$`value`)) {
        self$`value` <- this_object$`value`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return ConversionEventsDataItemsCustomData in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of ConversionEventsDataItemsCustomData
    #'
    #' @param input_json the JSON input
    #' @return the instance of ConversionEventsDataItemsCustomData
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`content_brand` <- this_object$`content_brand`
      self$`content_category` <- this_object$`content_category`
      self$`content_ids` <- ApiClient$new()$deserializeObj(this_object$`content_ids`, "array[character]", loadNamespace("openapi"))
      self$`content_name` <- this_object$`content_name`
      self$`contents` <- ApiClient$new()$deserializeObj(this_object$`contents`, "array[ConversionEventsDataItemsCustomDataContentsItems]", loadNamespace("openapi"))
      self$`currency` <- this_object$`currency`
      self$`external_measurement_id` <- this_object$`external_measurement_id`
      self$`external_measurement_vendor_id` <- this_object$`external_measurement_vendor_id`
      self$`np` <- this_object$`np`
      self$`num_items` <- this_object$`num_items`
      self$`opt_out_type` <- this_object$`opt_out_type`
      self$`order_id` <- this_object$`order_id`
      self$`predicted_ltv` <- this_object$`predicted_ltv`
      self$`search_string` <- this_object$`search_string`
      self$`value` <- this_object$`value`
      self
    },

    #' @description
    #' Validate JSON input with respect to ConversionEventsDataItemsCustomData and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of ConversionEventsDataItemsCustomData
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      TRUE
    },

    #' @description
    #' Return a list of invalid fields (if any).
    #'
    #' @return A list of invalid fields (if any).
    getInvalidFields = function() {
      invalid_fields <- list()
      invalid_fields
    },

    #' @description
    #' Print the object
    print = function() {
      print(jsonlite::prettify(self$toJSONString()))
      invisible(self)
    }
  ),
  # Lock the class to prevent modifications to the method or field
  lock_class = TRUE
)
## Uncomment below to unlock the class to allow modifications of the method or field
# ConversionEventsDataItemsCustomData$unlock()
#
## Below is an example to define the print function
# ConversionEventsDataItemsCustomData$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# ConversionEventsDataItemsCustomData$lock()

