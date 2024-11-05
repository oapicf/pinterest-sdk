#' Create a new ConversionEventsDataInnerCustomData
#'
#' @description
#' Object containing other custom data.
#'
#' @docType class
#' @title ConversionEventsDataInnerCustomData
#' @description ConversionEventsDataInnerCustomData Class
#' @format An \code{R6Class} generator object
#' @field currency The ISO-4217 currency code. If not provided, we will default to the advertiser's currency set during account creation. Your campaign performance needs this field to report right ROAS/CPA. character [optional]
#' @field value Total value of the event. Accepted as a string in the request; it will be parsed into a double. For example, if there are two items in a checkout event, the value should be the total price. We recommend to use pre-tax, pre-shipping final value. character [optional]
#' @field content_ids List of products IDs. We recommend using this if you are a merchant for PageVisit, AddToCart and Checkouts. For detail, please check <a href=\"https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs\" target=\"_blank\">here</a> (Install the Pinterest tag section). list(character) [optional]
#' @field content_name The name of the page or product associated with the event. character [optional]
#' @field content_category The category of the content associated with the event. character [optional]
#' @field content_brand The brand of the content associated with the event. character [optional]
#' @field contents A list of objects containing information about products, such as price and quantity. We recommend using this if you are a merchant for PageVisit, AddToCart and Checkouts. For detail, please check <a href=\"https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs\" target=\"_blank\">here</a> (Install the Pinterest tag section). list(\link{ConversionEventsDataInnerCustomDataContentsInner}) [optional]
#' @field num_items Total number of products of the event. For example, the total number of items purchased in a checkout event. We recommend using this if you are a merchant for AddToCart and Checkouts. For detail, please check <a href=\"https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs\" target=\"_blank\">here</a> (Install the Pinterest tag section). integer [optional]
#' @field order_id The order ID. We recommend sending order_id to help us deduplicate events when necessary. This also helps to run other measurement products at Pinterest. character [optional]
#' @field search_string The search string related to the user conversion event. character [optional]
#' @field opt_out_type Flags for different privacy rights laws to opt out users of sharing personal information. Values should be comma separated. Please follow the <a href=\"https://help.pinterest.com/en/business/article/limited-data-processing\" target=\"_blank\">Help Center</a> and <a href=\"/docs/api-features/conversion-overview/\" target=\"_blank\">dev site</a> for specific opt_out_type set up. character [optional]
#' @field np Named partner. Not required, this is for Pinterest internal use only. Please do not use this unless specifically guided. character [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
ConversionEventsDataInnerCustomData <- R6::R6Class(
  "ConversionEventsDataInnerCustomData",
  public = list(
    `currency` = NULL,
    `value` = NULL,
    `content_ids` = NULL,
    `content_name` = NULL,
    `content_category` = NULL,
    `content_brand` = NULL,
    `contents` = NULL,
    `num_items` = NULL,
    `order_id` = NULL,
    `search_string` = NULL,
    `opt_out_type` = NULL,
    `np` = NULL,

    #' @description
    #' Initialize a new ConversionEventsDataInnerCustomData class.
    #'
    #' @param currency The ISO-4217 currency code. If not provided, we will default to the advertiser's currency set during account creation. Your campaign performance needs this field to report right ROAS/CPA.
    #' @param value Total value of the event. Accepted as a string in the request; it will be parsed into a double. For example, if there are two items in a checkout event, the value should be the total price. We recommend to use pre-tax, pre-shipping final value.
    #' @param content_ids List of products IDs. We recommend using this if you are a merchant for PageVisit, AddToCart and Checkouts. For detail, please check <a href=\"https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs\" target=\"_blank\">here</a> (Install the Pinterest tag section).
    #' @param content_name The name of the page or product associated with the event.
    #' @param content_category The category of the content associated with the event.
    #' @param content_brand The brand of the content associated with the event.
    #' @param contents A list of objects containing information about products, such as price and quantity. We recommend using this if you are a merchant for PageVisit, AddToCart and Checkouts. For detail, please check <a href=\"https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs\" target=\"_blank\">here</a> (Install the Pinterest tag section).
    #' @param num_items Total number of products of the event. For example, the total number of items purchased in a checkout event. We recommend using this if you are a merchant for AddToCart and Checkouts. For detail, please check <a href=\"https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs\" target=\"_blank\">here</a> (Install the Pinterest tag section).
    #' @param order_id The order ID. We recommend sending order_id to help us deduplicate events when necessary. This also helps to run other measurement products at Pinterest.
    #' @param search_string The search string related to the user conversion event.
    #' @param opt_out_type Flags for different privacy rights laws to opt out users of sharing personal information. Values should be comma separated. Please follow the <a href=\"https://help.pinterest.com/en/business/article/limited-data-processing\" target=\"_blank\">Help Center</a> and <a href=\"/docs/api-features/conversion-overview/\" target=\"_blank\">dev site</a> for specific opt_out_type set up.
    #' @param np Named partner. Not required, this is for Pinterest internal use only. Please do not use this unless specifically guided.
    #' @param ... Other optional arguments.
    initialize = function(`currency` = NULL, `value` = NULL, `content_ids` = NULL, `content_name` = NULL, `content_category` = NULL, `content_brand` = NULL, `contents` = NULL, `num_items` = NULL, `order_id` = NULL, `search_string` = NULL, `opt_out_type` = NULL, `np` = NULL, ...) {
      if (!is.null(`currency`)) {
        if (!(is.character(`currency`) && length(`currency`) == 1)) {
          stop(paste("Error! Invalid data for `currency`. Must be a string:", `currency`))
        }
        self$`currency` <- `currency`
      }
      if (!is.null(`value`)) {
        if (!(is.character(`value`) && length(`value`) == 1)) {
          stop(paste("Error! Invalid data for `value`. Must be a string:", `value`))
        }
        self$`value` <- `value`
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
      if (!is.null(`content_category`)) {
        if (!(is.character(`content_category`) && length(`content_category`) == 1)) {
          stop(paste("Error! Invalid data for `content_category`. Must be a string:", `content_category`))
        }
        self$`content_category` <- `content_category`
      }
      if (!is.null(`content_brand`)) {
        if (!(is.character(`content_brand`) && length(`content_brand`) == 1)) {
          stop(paste("Error! Invalid data for `content_brand`. Must be a string:", `content_brand`))
        }
        self$`content_brand` <- `content_brand`
      }
      if (!is.null(`contents`)) {
        stopifnot(is.vector(`contents`), length(`contents`) != 0)
        sapply(`contents`, function(x) stopifnot(R6::is.R6(x)))
        self$`contents` <- `contents`
      }
      if (!is.null(`num_items`)) {
        if (!(is.numeric(`num_items`) && length(`num_items`) == 1)) {
          stop(paste("Error! Invalid data for `num_items`. Must be an integer:", `num_items`))
        }
        self$`num_items` <- `num_items`
      }
      if (!is.null(`order_id`)) {
        if (!(is.character(`order_id`) && length(`order_id`) == 1)) {
          stop(paste("Error! Invalid data for `order_id`. Must be a string:", `order_id`))
        }
        self$`order_id` <- `order_id`
      }
      if (!is.null(`search_string`)) {
        if (!(is.character(`search_string`) && length(`search_string`) == 1)) {
          stop(paste("Error! Invalid data for `search_string`. Must be a string:", `search_string`))
        }
        self$`search_string` <- `search_string`
      }
      if (!is.null(`opt_out_type`)) {
        if (!(is.character(`opt_out_type`) && length(`opt_out_type`) == 1)) {
          stop(paste("Error! Invalid data for `opt_out_type`. Must be a string:", `opt_out_type`))
        }
        self$`opt_out_type` <- `opt_out_type`
      }
      if (!is.null(`np`)) {
        if (!(is.character(`np`) && length(`np`) == 1)) {
          stop(paste("Error! Invalid data for `np`. Must be a string:", `np`))
        }
        self$`np` <- `np`
      }
    },

    #' @description
    #' To JSON String
    #'
    #' @return ConversionEventsDataInnerCustomData in JSON format
    toJSON = function() {
      ConversionEventsDataInnerCustomDataObject <- list()
      if (!is.null(self$`currency`)) {
        ConversionEventsDataInnerCustomDataObject[["currency"]] <-
          self$`currency`
      }
      if (!is.null(self$`value`)) {
        ConversionEventsDataInnerCustomDataObject[["value"]] <-
          self$`value`
      }
      if (!is.null(self$`content_ids`)) {
        ConversionEventsDataInnerCustomDataObject[["content_ids"]] <-
          self$`content_ids`
      }
      if (!is.null(self$`content_name`)) {
        ConversionEventsDataInnerCustomDataObject[["content_name"]] <-
          self$`content_name`
      }
      if (!is.null(self$`content_category`)) {
        ConversionEventsDataInnerCustomDataObject[["content_category"]] <-
          self$`content_category`
      }
      if (!is.null(self$`content_brand`)) {
        ConversionEventsDataInnerCustomDataObject[["content_brand"]] <-
          self$`content_brand`
      }
      if (!is.null(self$`contents`)) {
        ConversionEventsDataInnerCustomDataObject[["contents"]] <-
          lapply(self$`contents`, function(x) x$toJSON())
      }
      if (!is.null(self$`num_items`)) {
        ConversionEventsDataInnerCustomDataObject[["num_items"]] <-
          self$`num_items`
      }
      if (!is.null(self$`order_id`)) {
        ConversionEventsDataInnerCustomDataObject[["order_id"]] <-
          self$`order_id`
      }
      if (!is.null(self$`search_string`)) {
        ConversionEventsDataInnerCustomDataObject[["search_string"]] <-
          self$`search_string`
      }
      if (!is.null(self$`opt_out_type`)) {
        ConversionEventsDataInnerCustomDataObject[["opt_out_type"]] <-
          self$`opt_out_type`
      }
      if (!is.null(self$`np`)) {
        ConversionEventsDataInnerCustomDataObject[["np"]] <-
          self$`np`
      }
      ConversionEventsDataInnerCustomDataObject
    },

    #' @description
    #' Deserialize JSON string into an instance of ConversionEventsDataInnerCustomData
    #'
    #' @param input_json the JSON input
    #' @return the instance of ConversionEventsDataInnerCustomData
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`currency`)) {
        self$`currency` <- this_object$`currency`
      }
      if (!is.null(this_object$`value`)) {
        self$`value` <- this_object$`value`
      }
      if (!is.null(this_object$`content_ids`)) {
        self$`content_ids` <- ApiClient$new()$deserializeObj(this_object$`content_ids`, "array[character]", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`content_name`)) {
        self$`content_name` <- this_object$`content_name`
      }
      if (!is.null(this_object$`content_category`)) {
        self$`content_category` <- this_object$`content_category`
      }
      if (!is.null(this_object$`content_brand`)) {
        self$`content_brand` <- this_object$`content_brand`
      }
      if (!is.null(this_object$`contents`)) {
        self$`contents` <- ApiClient$new()$deserializeObj(this_object$`contents`, "array[ConversionEventsDataInnerCustomDataContentsInner]", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`num_items`)) {
        self$`num_items` <- this_object$`num_items`
      }
      if (!is.null(this_object$`order_id`)) {
        self$`order_id` <- this_object$`order_id`
      }
      if (!is.null(this_object$`search_string`)) {
        self$`search_string` <- this_object$`search_string`
      }
      if (!is.null(this_object$`opt_out_type`)) {
        self$`opt_out_type` <- this_object$`opt_out_type`
      }
      if (!is.null(this_object$`np`)) {
        self$`np` <- this_object$`np`
      }
      self
    },

    #' @description
    #' To JSON String
    #'
    #' @return ConversionEventsDataInnerCustomData in JSON format
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`currency`)) {
          sprintf(
          '"currency":
            "%s"
                    ',
          self$`currency`
          )
        },
        if (!is.null(self$`value`)) {
          sprintf(
          '"value":
            "%s"
                    ',
          self$`value`
          )
        },
        if (!is.null(self$`content_ids`)) {
          sprintf(
          '"content_ids":
             [%s]
          ',
          paste(unlist(lapply(self$`content_ids`, function(x) paste0('"', x, '"'))), collapse = ",")
          )
        },
        if (!is.null(self$`content_name`)) {
          sprintf(
          '"content_name":
            "%s"
                    ',
          self$`content_name`
          )
        },
        if (!is.null(self$`content_category`)) {
          sprintf(
          '"content_category":
            "%s"
                    ',
          self$`content_category`
          )
        },
        if (!is.null(self$`content_brand`)) {
          sprintf(
          '"content_brand":
            "%s"
                    ',
          self$`content_brand`
          )
        },
        if (!is.null(self$`contents`)) {
          sprintf(
          '"contents":
          [%s]
',
          paste(sapply(self$`contents`, function(x) jsonlite::toJSON(x$toJSON(), auto_unbox = TRUE, digits = NA)), collapse = ",")
          )
        },
        if (!is.null(self$`num_items`)) {
          sprintf(
          '"num_items":
            %d
                    ',
          self$`num_items`
          )
        },
        if (!is.null(self$`order_id`)) {
          sprintf(
          '"order_id":
            "%s"
                    ',
          self$`order_id`
          )
        },
        if (!is.null(self$`search_string`)) {
          sprintf(
          '"search_string":
            "%s"
                    ',
          self$`search_string`
          )
        },
        if (!is.null(self$`opt_out_type`)) {
          sprintf(
          '"opt_out_type":
            "%s"
                    ',
          self$`opt_out_type`
          )
        },
        if (!is.null(self$`np`)) {
          sprintf(
          '"np":
            "%s"
                    ',
          self$`np`
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },

    #' @description
    #' Deserialize JSON string into an instance of ConversionEventsDataInnerCustomData
    #'
    #' @param input_json the JSON input
    #' @return the instance of ConversionEventsDataInnerCustomData
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`currency` <- this_object$`currency`
      self$`value` <- this_object$`value`
      self$`content_ids` <- ApiClient$new()$deserializeObj(this_object$`content_ids`, "array[character]", loadNamespace("openapi"))
      self$`content_name` <- this_object$`content_name`
      self$`content_category` <- this_object$`content_category`
      self$`content_brand` <- this_object$`content_brand`
      self$`contents` <- ApiClient$new()$deserializeObj(this_object$`contents`, "array[ConversionEventsDataInnerCustomDataContentsInner]", loadNamespace("openapi"))
      self$`num_items` <- this_object$`num_items`
      self$`order_id` <- this_object$`order_id`
      self$`search_string` <- this_object$`search_string`
      self$`opt_out_type` <- this_object$`opt_out_type`
      self$`np` <- this_object$`np`
      self
    },

    #' @description
    #' Validate JSON input with respect to ConversionEventsDataInnerCustomData and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of ConversionEventsDataInnerCustomData
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
# ConversionEventsDataInnerCustomData$unlock()
#
## Below is an example to define the print function
# ConversionEventsDataInnerCustomData$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# ConversionEventsDataInnerCustomData$lock()

