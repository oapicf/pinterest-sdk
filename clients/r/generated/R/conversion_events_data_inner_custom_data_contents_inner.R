#' Create a new ConversionEventsDataInnerCustomDataContentsInner
#'
#' @description
#' ConversionEventsDataInnerCustomDataContentsInner Class
#'
#' @docType class
#' @title ConversionEventsDataInnerCustomDataContentsInner
#' @description ConversionEventsDataInnerCustomDataContentsInner Class
#' @format An \code{R6Class} generator object
#' @field id The id of a product. We recommend using this if you are a merchant for AddToCart and Checkouts. For detail, please check <a href=\"https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs\" target=\"_blank\">here</a> (Install the Pinterest tag section). character [optional]
#' @field item_price The price of a product. Accepted as a string in the request; it will be parsed into a double. This is the original item value before any discount. We recommend using this if you are a merchant for PageVisit, AddToCart and Checkouts. For detail, please check <a href=\"https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs\" target=\"_blank\">here</a> (Install the Pinterest tag section). character [optional]
#' @field quantity The amount of a product. We recommend using this if you are a merchant for AddToCart and Checkouts. For detail, please check <a href=\"https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs\" target=\"_blank\">here</a> (Install the Pinterest tag section). integer [optional]
#' @field item_name The name of a product. character [optional]
#' @field item_category The category of a product. character [optional]
#' @field item_brand The brand of a product. character [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
ConversionEventsDataInnerCustomDataContentsInner <- R6::R6Class(
  "ConversionEventsDataInnerCustomDataContentsInner",
  public = list(
    `id` = NULL,
    `item_price` = NULL,
    `quantity` = NULL,
    `item_name` = NULL,
    `item_category` = NULL,
    `item_brand` = NULL,
    #' Initialize a new ConversionEventsDataInnerCustomDataContentsInner class.
    #'
    #' @description
    #' Initialize a new ConversionEventsDataInnerCustomDataContentsInner class.
    #'
    #' @param id The id of a product. We recommend using this if you are a merchant for AddToCart and Checkouts. For detail, please check <a href=\"https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs\" target=\"_blank\">here</a> (Install the Pinterest tag section).
    #' @param item_price The price of a product. Accepted as a string in the request; it will be parsed into a double. This is the original item value before any discount. We recommend using this if you are a merchant for PageVisit, AddToCart and Checkouts. For detail, please check <a href=\"https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs\" target=\"_blank\">here</a> (Install the Pinterest tag section).
    #' @param quantity The amount of a product. We recommend using this if you are a merchant for AddToCart and Checkouts. For detail, please check <a href=\"https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs\" target=\"_blank\">here</a> (Install the Pinterest tag section).
    #' @param item_name The name of a product.
    #' @param item_category The category of a product.
    #' @param item_brand The brand of a product.
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`id` = NULL, `item_price` = NULL, `quantity` = NULL, `item_name` = NULL, `item_category` = NULL, `item_brand` = NULL, ...) {
      if (!is.null(`id`)) {
        if (!(is.character(`id`) && length(`id`) == 1)) {
          stop(paste("Error! Invalid data for `id`. Must be a string:", `id`))
        }
        self$`id` <- `id`
      }
      if (!is.null(`item_price`)) {
        if (!(is.character(`item_price`) && length(`item_price`) == 1)) {
          stop(paste("Error! Invalid data for `item_price`. Must be a string:", `item_price`))
        }
        self$`item_price` <- `item_price`
      }
      if (!is.null(`quantity`)) {
        if (!(is.numeric(`quantity`) && length(`quantity`) == 1)) {
          stop(paste("Error! Invalid data for `quantity`. Must be an integer:", `quantity`))
        }
        self$`quantity` <- `quantity`
      }
      if (!is.null(`item_name`)) {
        if (!(is.character(`item_name`) && length(`item_name`) == 1)) {
          stop(paste("Error! Invalid data for `item_name`. Must be a string:", `item_name`))
        }
        self$`item_name` <- `item_name`
      }
      if (!is.null(`item_category`)) {
        if (!(is.character(`item_category`) && length(`item_category`) == 1)) {
          stop(paste("Error! Invalid data for `item_category`. Must be a string:", `item_category`))
        }
        self$`item_category` <- `item_category`
      }
      if (!is.null(`item_brand`)) {
        if (!(is.character(`item_brand`) && length(`item_brand`) == 1)) {
          stop(paste("Error! Invalid data for `item_brand`. Must be a string:", `item_brand`))
        }
        self$`item_brand` <- `item_brand`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return ConversionEventsDataInnerCustomDataContentsInner in JSON format
    #' @export
    toJSON = function() {
      ConversionEventsDataInnerCustomDataContentsInnerObject <- list()
      if (!is.null(self$`id`)) {
        ConversionEventsDataInnerCustomDataContentsInnerObject[["id"]] <-
          self$`id`
      }
      if (!is.null(self$`item_price`)) {
        ConversionEventsDataInnerCustomDataContentsInnerObject[["item_price"]] <-
          self$`item_price`
      }
      if (!is.null(self$`quantity`)) {
        ConversionEventsDataInnerCustomDataContentsInnerObject[["quantity"]] <-
          self$`quantity`
      }
      if (!is.null(self$`item_name`)) {
        ConversionEventsDataInnerCustomDataContentsInnerObject[["item_name"]] <-
          self$`item_name`
      }
      if (!is.null(self$`item_category`)) {
        ConversionEventsDataInnerCustomDataContentsInnerObject[["item_category"]] <-
          self$`item_category`
      }
      if (!is.null(self$`item_brand`)) {
        ConversionEventsDataInnerCustomDataContentsInnerObject[["item_brand"]] <-
          self$`item_brand`
      }
      ConversionEventsDataInnerCustomDataContentsInnerObject
    },
    #' Deserialize JSON string into an instance of ConversionEventsDataInnerCustomDataContentsInner
    #'
    #' @description
    #' Deserialize JSON string into an instance of ConversionEventsDataInnerCustomDataContentsInner
    #'
    #' @param input_json the JSON input
    #' @return the instance of ConversionEventsDataInnerCustomDataContentsInner
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`id`)) {
        self$`id` <- this_object$`id`
      }
      if (!is.null(this_object$`item_price`)) {
        self$`item_price` <- this_object$`item_price`
      }
      if (!is.null(this_object$`quantity`)) {
        self$`quantity` <- this_object$`quantity`
      }
      if (!is.null(this_object$`item_name`)) {
        self$`item_name` <- this_object$`item_name`
      }
      if (!is.null(this_object$`item_category`)) {
        self$`item_category` <- this_object$`item_category`
      }
      if (!is.null(this_object$`item_brand`)) {
        self$`item_brand` <- this_object$`item_brand`
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return ConversionEventsDataInnerCustomDataContentsInner in JSON format
    #' @export
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`id`)) {
          sprintf(
          '"id":
            "%s"
                    ',
          self$`id`
          )
        },
        if (!is.null(self$`item_price`)) {
          sprintf(
          '"item_price":
            "%s"
                    ',
          self$`item_price`
          )
        },
        if (!is.null(self$`quantity`)) {
          sprintf(
          '"quantity":
            %d
                    ',
          self$`quantity`
          )
        },
        if (!is.null(self$`item_name`)) {
          sprintf(
          '"item_name":
            "%s"
                    ',
          self$`item_name`
          )
        },
        if (!is.null(self$`item_category`)) {
          sprintf(
          '"item_category":
            "%s"
                    ',
          self$`item_category`
          )
        },
        if (!is.null(self$`item_brand`)) {
          sprintf(
          '"item_brand":
            "%s"
                    ',
          self$`item_brand`
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of ConversionEventsDataInnerCustomDataContentsInner
    #'
    #' @description
    #' Deserialize JSON string into an instance of ConversionEventsDataInnerCustomDataContentsInner
    #'
    #' @param input_json the JSON input
    #' @return the instance of ConversionEventsDataInnerCustomDataContentsInner
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`id` <- this_object$`id`
      self$`item_price` <- this_object$`item_price`
      self$`quantity` <- this_object$`quantity`
      self$`item_name` <- this_object$`item_name`
      self$`item_category` <- this_object$`item_category`
      self$`item_brand` <- this_object$`item_brand`
      self
    },
    #' Validate JSON input with respect to ConversionEventsDataInnerCustomDataContentsInner
    #'
    #' @description
    #' Validate JSON input with respect to ConversionEventsDataInnerCustomDataContentsInner and throw an exception if invalid
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
    #' @return String representation of ConversionEventsDataInnerCustomDataContentsInner
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
# ConversionEventsDataInnerCustomDataContentsInner$unlock()
#
## Below is an example to define the print function
# ConversionEventsDataInnerCustomDataContentsInner$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# ConversionEventsDataInnerCustomDataContentsInner$lock()

