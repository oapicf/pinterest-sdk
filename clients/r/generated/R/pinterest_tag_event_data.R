#' Create a new PinterestTagEventData
#'
#' @description
#' Optional for VISITOR `audience_type`. With the Pinterest tag, you can use event data to capture event details from your website. This object lists all the available predefined event data fields in the Pinterest tag. You can include these event data fields as part of a VISITOR audience’s `rule`; however, you **must** specify an `event` for the `event_data` fields to be evaluated. Besides what’s listed, you can also create your own set of `event_data` fields and define their usages or purposes according to your website needs. However, the benefit of using the predefined event data fields is that we can provide various metrics based on those fields' data.<br>Examples per `event` type:<br>`pagevisit`<br>\"event_data\": { \"page_name\": \"My online store 123 | view items | shoe\" }<br>`signup`<br>\"event_data\": { \"lead_type\": \"New release promotion\" }<br>`checkout`<br>\"event_data\": { \"value\": 116, \"order_quantity\": 2, \"currency\": \"USD\", \"line_items\": [ { \"product_name\": \"Pillows (Set of 2)\", \"product_id\": \"11\", \"product_price\": 48, \"product_quantity\": 1 }, { \"product_name\": \"Pillows, Large (Set of 2)\", \"product_id\": \"15\", \"product_price\": 68, \"product_quantity\": 1 } ] }<br>`addtocart`<br>\"event_data\": { \"value\": 499, \"order_quantity\": 1, \"currency\": \"USD\", \"line_items\": [ { \"product_name\": \"Red leather boots\", \"product_id\": \"3486\", \"product_category\": \"shoe\", \"product_variant_id\": \"JB11103000\", \"product_price\": 499, \"product_quantity\": \"1\", \"product_brand\": \"My brand\" }]}<br>`watchvideo`<br>\"event_data\": { \"video_title\": \"My Product Video 01\" }<br>`lead`<br>\"event_data\": { \"lead_type\": \"Newsletter\" }
#'
#' @docType class
#' @title PinterestTagEventData
#' @description PinterestTagEventData Class
#' @format An \code{R6Class} generator object
#' @field currency  \link{Currency} [optional]
#' @field lead_type Promotion code. For example, \"Newsletter\". character [optional]
#' @field line_items  \link{LineItem} [optional]
#' @field order_id Order ID. For example, \"X-151481\". character [optional]
#' @field order_quantity Order quantity. For example, 1. integer [optional]
#' @field page_name Page name. For example, \"Our Favorite Pins on Pinterest\". character [optional]
#' @field promo_code Promotion code. For example, \"WINTER10\". character [optional]
#' @field property Property. For example, \"Athleta\". character [optional]
#' @field search_query Search query string. For example, \"boots\". character [optional]
#' @field value Product value. For example, \"199.98\" character [optional]
#' @field video_title Video title. For example, \"How to style your Parker Boots\". character [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
PinterestTagEventData <- R6::R6Class(
  "PinterestTagEventData",
  public = list(
    `currency` = NULL,
    `lead_type` = NULL,
    `line_items` = NULL,
    `order_id` = NULL,
    `order_quantity` = NULL,
    `page_name` = NULL,
    `promo_code` = NULL,
    `property` = NULL,
    `search_query` = NULL,
    `value` = NULL,
    `video_title` = NULL,
    #' Initialize a new PinterestTagEventData class.
    #'
    #' @description
    #' Initialize a new PinterestTagEventData class.
    #'
    #' @param currency currency
    #' @param lead_type Promotion code. For example, \"Newsletter\".
    #' @param line_items line_items
    #' @param order_id Order ID. For example, \"X-151481\".
    #' @param order_quantity Order quantity. For example, 1.
    #' @param page_name Page name. For example, \"Our Favorite Pins on Pinterest\".
    #' @param promo_code Promotion code. For example, \"WINTER10\".
    #' @param property Property. For example, \"Athleta\".
    #' @param search_query Search query string. For example, \"boots\".
    #' @param value Product value. For example, \"199.98\"
    #' @param video_title Video title. For example, \"How to style your Parker Boots\".
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`currency` = NULL, `lead_type` = NULL, `line_items` = NULL, `order_id` = NULL, `order_quantity` = NULL, `page_name` = NULL, `promo_code` = NULL, `property` = NULL, `search_query` = NULL, `value` = NULL, `video_title` = NULL, ...) {
      if (!is.null(`currency`)) {
        if (!(`currency` %in% c())) {
          stop(paste("Error! \"", `currency`, "\" cannot be assigned to `currency`. Must be .", sep = ""))
        }
        stopifnot(R6::is.R6(`currency`))
        self$`currency` <- `currency`
      }
      if (!is.null(`lead_type`)) {
        if (!(is.character(`lead_type`) && length(`lead_type`) == 1)) {
          stop(paste("Error! Invalid data for `lead_type`. Must be a string:", `lead_type`))
        }
        self$`lead_type` <- `lead_type`
      }
      if (!is.null(`line_items`)) {
        stopifnot(R6::is.R6(`line_items`))
        self$`line_items` <- `line_items`
      }
      if (!is.null(`order_id`)) {
        if (!(is.character(`order_id`) && length(`order_id`) == 1)) {
          stop(paste("Error! Invalid data for `order_id`. Must be a string:", `order_id`))
        }
        self$`order_id` <- `order_id`
      }
      if (!is.null(`order_quantity`)) {
        if (!(is.numeric(`order_quantity`) && length(`order_quantity`) == 1)) {
          stop(paste("Error! Invalid data for `order_quantity`. Must be an integer:", `order_quantity`))
        }
        self$`order_quantity` <- `order_quantity`
      }
      if (!is.null(`page_name`)) {
        if (!(is.character(`page_name`) && length(`page_name`) == 1)) {
          stop(paste("Error! Invalid data for `page_name`. Must be a string:", `page_name`))
        }
        self$`page_name` <- `page_name`
      }
      if (!is.null(`promo_code`)) {
        if (!(is.character(`promo_code`) && length(`promo_code`) == 1)) {
          stop(paste("Error! Invalid data for `promo_code`. Must be a string:", `promo_code`))
        }
        self$`promo_code` <- `promo_code`
      }
      if (!is.null(`property`)) {
        if (!(is.character(`property`) && length(`property`) == 1)) {
          stop(paste("Error! Invalid data for `property`. Must be a string:", `property`))
        }
        self$`property` <- `property`
      }
      if (!is.null(`search_query`)) {
        if (!(is.character(`search_query`) && length(`search_query`) == 1)) {
          stop(paste("Error! Invalid data for `search_query`. Must be a string:", `search_query`))
        }
        self$`search_query` <- `search_query`
      }
      if (!is.null(`value`)) {
        if (!(is.character(`value`) && length(`value`) == 1)) {
          stop(paste("Error! Invalid data for `value`. Must be a string:", `value`))
        }
        self$`value` <- `value`
      }
      if (!is.null(`video_title`)) {
        if (!(is.character(`video_title`) && length(`video_title`) == 1)) {
          stop(paste("Error! Invalid data for `video_title`. Must be a string:", `video_title`))
        }
        self$`video_title` <- `video_title`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return PinterestTagEventData in JSON format
    #' @export
    toJSON = function() {
      PinterestTagEventDataObject <- list()
      if (!is.null(self$`currency`)) {
        PinterestTagEventDataObject[["currency"]] <-
          self$`currency`$toJSON()
      }
      if (!is.null(self$`lead_type`)) {
        PinterestTagEventDataObject[["lead_type"]] <-
          self$`lead_type`
      }
      if (!is.null(self$`line_items`)) {
        PinterestTagEventDataObject[["line_items"]] <-
          self$`line_items`$toJSON()
      }
      if (!is.null(self$`order_id`)) {
        PinterestTagEventDataObject[["order_id"]] <-
          self$`order_id`
      }
      if (!is.null(self$`order_quantity`)) {
        PinterestTagEventDataObject[["order_quantity"]] <-
          self$`order_quantity`
      }
      if (!is.null(self$`page_name`)) {
        PinterestTagEventDataObject[["page_name"]] <-
          self$`page_name`
      }
      if (!is.null(self$`promo_code`)) {
        PinterestTagEventDataObject[["promo_code"]] <-
          self$`promo_code`
      }
      if (!is.null(self$`property`)) {
        PinterestTagEventDataObject[["property"]] <-
          self$`property`
      }
      if (!is.null(self$`search_query`)) {
        PinterestTagEventDataObject[["search_query"]] <-
          self$`search_query`
      }
      if (!is.null(self$`value`)) {
        PinterestTagEventDataObject[["value"]] <-
          self$`value`
      }
      if (!is.null(self$`video_title`)) {
        PinterestTagEventDataObject[["video_title"]] <-
          self$`video_title`
      }
      PinterestTagEventDataObject
    },
    #' Deserialize JSON string into an instance of PinterestTagEventData
    #'
    #' @description
    #' Deserialize JSON string into an instance of PinterestTagEventData
    #'
    #' @param input_json the JSON input
    #' @return the instance of PinterestTagEventData
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`currency`)) {
        `currency_object` <- Currency$new()
        `currency_object`$fromJSON(jsonlite::toJSON(this_object$`currency`, auto_unbox = TRUE, digits = NA))
        self$`currency` <- `currency_object`
      }
      if (!is.null(this_object$`lead_type`)) {
        self$`lead_type` <- this_object$`lead_type`
      }
      if (!is.null(this_object$`line_items`)) {
        `line_items_object` <- LineItem$new()
        `line_items_object`$fromJSON(jsonlite::toJSON(this_object$`line_items`, auto_unbox = TRUE, digits = NA))
        self$`line_items` <- `line_items_object`
      }
      if (!is.null(this_object$`order_id`)) {
        self$`order_id` <- this_object$`order_id`
      }
      if (!is.null(this_object$`order_quantity`)) {
        self$`order_quantity` <- this_object$`order_quantity`
      }
      if (!is.null(this_object$`page_name`)) {
        self$`page_name` <- this_object$`page_name`
      }
      if (!is.null(this_object$`promo_code`)) {
        self$`promo_code` <- this_object$`promo_code`
      }
      if (!is.null(this_object$`property`)) {
        self$`property` <- this_object$`property`
      }
      if (!is.null(this_object$`search_query`)) {
        self$`search_query` <- this_object$`search_query`
      }
      if (!is.null(this_object$`value`)) {
        self$`value` <- this_object$`value`
      }
      if (!is.null(this_object$`video_title`)) {
        self$`video_title` <- this_object$`video_title`
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return PinterestTagEventData in JSON format
    #' @export
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`currency`)) {
          sprintf(
          '"currency":
          %s
          ',
          jsonlite::toJSON(self$`currency`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        },
        if (!is.null(self$`lead_type`)) {
          sprintf(
          '"lead_type":
            "%s"
                    ',
          self$`lead_type`
          )
        },
        if (!is.null(self$`line_items`)) {
          sprintf(
          '"line_items":
          %s
          ',
          jsonlite::toJSON(self$`line_items`$toJSON(), auto_unbox = TRUE, digits = NA)
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
        if (!is.null(self$`order_quantity`)) {
          sprintf(
          '"order_quantity":
            %d
                    ',
          self$`order_quantity`
          )
        },
        if (!is.null(self$`page_name`)) {
          sprintf(
          '"page_name":
            "%s"
                    ',
          self$`page_name`
          )
        },
        if (!is.null(self$`promo_code`)) {
          sprintf(
          '"promo_code":
            "%s"
                    ',
          self$`promo_code`
          )
        },
        if (!is.null(self$`property`)) {
          sprintf(
          '"property":
            "%s"
                    ',
          self$`property`
          )
        },
        if (!is.null(self$`search_query`)) {
          sprintf(
          '"search_query":
            "%s"
                    ',
          self$`search_query`
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
        if (!is.null(self$`video_title`)) {
          sprintf(
          '"video_title":
            "%s"
                    ',
          self$`video_title`
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of PinterestTagEventData
    #'
    #' @description
    #' Deserialize JSON string into an instance of PinterestTagEventData
    #'
    #' @param input_json the JSON input
    #' @return the instance of PinterestTagEventData
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`currency` <- Currency$new()$fromJSON(jsonlite::toJSON(this_object$`currency`, auto_unbox = TRUE, digits = NA))
      self$`lead_type` <- this_object$`lead_type`
      self$`line_items` <- LineItem$new()$fromJSON(jsonlite::toJSON(this_object$`line_items`, auto_unbox = TRUE, digits = NA))
      self$`order_id` <- this_object$`order_id`
      self$`order_quantity` <- this_object$`order_quantity`
      self$`page_name` <- this_object$`page_name`
      self$`promo_code` <- this_object$`promo_code`
      self$`property` <- this_object$`property`
      self$`search_query` <- this_object$`search_query`
      self$`value` <- this_object$`value`
      self$`video_title` <- this_object$`video_title`
      self
    },
    #' Validate JSON input with respect to PinterestTagEventData
    #'
    #' @description
    #' Validate JSON input with respect to PinterestTagEventData and throw an exception if invalid
    #'
    #' @param input the JSON input
    #' @export
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },
    #' To string (JSON format)
    #'
    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of PinterestTagEventData
    #' @export
    toString = function() {
      self$toJSONString()
    },
    #' Return true if the values in all fields are valid.
    #'
    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    #' @export
    isValid = function() {
      TRUE
    },
    #' Return a list of invalid fields (if any).
    #'
    #' @description
    #' Return a list of invalid fields (if any).
    #'
    #' @return A list of invalid fields (if any).
    #' @export
    getInvalidFields = function() {
      invalid_fields <- list()
      invalid_fields
    },
    #' Print the object
    #'
    #' @description
    #' Print the object
    #'
    #' @export
    print = function() {
      print(jsonlite::prettify(self$toJSONString()))
      invisible(self)
    }
  ),
  # Lock the class to prevent modifications to the method or field
  lock_class = TRUE
)
## Uncomment below to unlock the class to allow modifications of the method or field
# PinterestTagEventData$unlock()
#
## Below is an example to define the print function
# PinterestTagEventData$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# PinterestTagEventData$lock()

