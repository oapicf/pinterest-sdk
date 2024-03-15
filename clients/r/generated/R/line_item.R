#' Create a new LineItem
#'
#' @description
#' LineItem Class
#'
#' @docType class
#' @title LineItem
#' @description LineItem Class
#' @format An \code{R6Class} generator object
#' @field product_brand Product brand. For example, \"Parker\". character [optional]
#' @field product_category Product category. For example, \"Shoes\". character [optional]
#' @field product_id Product ID. For example, 1414. integer [optional]
#' @field product_name Product name. For example, \"Parker Boots\". character [optional]
#' @field product_price Product price. For example, \"99.99\". character [optional]
#' @field product_quantity Product quantity. For example, 2. integer [optional]
#' @field product_variant Product variant. For example, \"Red\". character [optional]
#' @field product_variant_id Product variant ID. For example, \"1414-34832\". character [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
LineItem <- R6::R6Class(
  "LineItem",
  public = list(
    `product_brand` = NULL,
    `product_category` = NULL,
    `product_id` = NULL,
    `product_name` = NULL,
    `product_price` = NULL,
    `product_quantity` = NULL,
    `product_variant` = NULL,
    `product_variant_id` = NULL,
    #' Initialize a new LineItem class.
    #'
    #' @description
    #' Initialize a new LineItem class.
    #'
    #' @param product_brand Product brand. For example, \"Parker\".
    #' @param product_category Product category. For example, \"Shoes\".
    #' @param product_id Product ID. For example, 1414.
    #' @param product_name Product name. For example, \"Parker Boots\".
    #' @param product_price Product price. For example, \"99.99\".
    #' @param product_quantity Product quantity. For example, 2.
    #' @param product_variant Product variant. For example, \"Red\".
    #' @param product_variant_id Product variant ID. For example, \"1414-34832\".
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`product_brand` = NULL, `product_category` = NULL, `product_id` = NULL, `product_name` = NULL, `product_price` = NULL, `product_quantity` = NULL, `product_variant` = NULL, `product_variant_id` = NULL, ...) {
      if (!is.null(`product_brand`)) {
        if (!(is.character(`product_brand`) && length(`product_brand`) == 1)) {
          stop(paste("Error! Invalid data for `product_brand`. Must be a string:", `product_brand`))
        }
        self$`product_brand` <- `product_brand`
      }
      if (!is.null(`product_category`)) {
        if (!(is.character(`product_category`) && length(`product_category`) == 1)) {
          stop(paste("Error! Invalid data for `product_category`. Must be a string:", `product_category`))
        }
        self$`product_category` <- `product_category`
      }
      if (!is.null(`product_id`)) {
        if (!(is.numeric(`product_id`) && length(`product_id`) == 1)) {
          stop(paste("Error! Invalid data for `product_id`. Must be an integer:", `product_id`))
        }
        self$`product_id` <- `product_id`
      }
      if (!is.null(`product_name`)) {
        if (!(is.character(`product_name`) && length(`product_name`) == 1)) {
          stop(paste("Error! Invalid data for `product_name`. Must be a string:", `product_name`))
        }
        self$`product_name` <- `product_name`
      }
      if (!is.null(`product_price`)) {
        if (!(is.character(`product_price`) && length(`product_price`) == 1)) {
          stop(paste("Error! Invalid data for `product_price`. Must be a string:", `product_price`))
        }
        self$`product_price` <- `product_price`
      }
      if (!is.null(`product_quantity`)) {
        if (!(is.numeric(`product_quantity`) && length(`product_quantity`) == 1)) {
          stop(paste("Error! Invalid data for `product_quantity`. Must be an integer:", `product_quantity`))
        }
        self$`product_quantity` <- `product_quantity`
      }
      if (!is.null(`product_variant`)) {
        if (!(is.character(`product_variant`) && length(`product_variant`) == 1)) {
          stop(paste("Error! Invalid data for `product_variant`. Must be a string:", `product_variant`))
        }
        self$`product_variant` <- `product_variant`
      }
      if (!is.null(`product_variant_id`)) {
        if (!(is.character(`product_variant_id`) && length(`product_variant_id`) == 1)) {
          stop(paste("Error! Invalid data for `product_variant_id`. Must be a string:", `product_variant_id`))
        }
        self$`product_variant_id` <- `product_variant_id`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return LineItem in JSON format
    #' @export
    toJSON = function() {
      LineItemObject <- list()
      if (!is.null(self$`product_brand`)) {
        LineItemObject[["product_brand"]] <-
          self$`product_brand`
      }
      if (!is.null(self$`product_category`)) {
        LineItemObject[["product_category"]] <-
          self$`product_category`
      }
      if (!is.null(self$`product_id`)) {
        LineItemObject[["product_id"]] <-
          self$`product_id`
      }
      if (!is.null(self$`product_name`)) {
        LineItemObject[["product_name"]] <-
          self$`product_name`
      }
      if (!is.null(self$`product_price`)) {
        LineItemObject[["product_price"]] <-
          self$`product_price`
      }
      if (!is.null(self$`product_quantity`)) {
        LineItemObject[["product_quantity"]] <-
          self$`product_quantity`
      }
      if (!is.null(self$`product_variant`)) {
        LineItemObject[["product_variant"]] <-
          self$`product_variant`
      }
      if (!is.null(self$`product_variant_id`)) {
        LineItemObject[["product_variant_id"]] <-
          self$`product_variant_id`
      }
      LineItemObject
    },
    #' Deserialize JSON string into an instance of LineItem
    #'
    #' @description
    #' Deserialize JSON string into an instance of LineItem
    #'
    #' @param input_json the JSON input
    #' @return the instance of LineItem
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`product_brand`)) {
        self$`product_brand` <- this_object$`product_brand`
      }
      if (!is.null(this_object$`product_category`)) {
        self$`product_category` <- this_object$`product_category`
      }
      if (!is.null(this_object$`product_id`)) {
        self$`product_id` <- this_object$`product_id`
      }
      if (!is.null(this_object$`product_name`)) {
        self$`product_name` <- this_object$`product_name`
      }
      if (!is.null(this_object$`product_price`)) {
        self$`product_price` <- this_object$`product_price`
      }
      if (!is.null(this_object$`product_quantity`)) {
        self$`product_quantity` <- this_object$`product_quantity`
      }
      if (!is.null(this_object$`product_variant`)) {
        self$`product_variant` <- this_object$`product_variant`
      }
      if (!is.null(this_object$`product_variant_id`)) {
        self$`product_variant_id` <- this_object$`product_variant_id`
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return LineItem in JSON format
    #' @export
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`product_brand`)) {
          sprintf(
          '"product_brand":
            "%s"
                    ',
          self$`product_brand`
          )
        },
        if (!is.null(self$`product_category`)) {
          sprintf(
          '"product_category":
            "%s"
                    ',
          self$`product_category`
          )
        },
        if (!is.null(self$`product_id`)) {
          sprintf(
          '"product_id":
            %d
                    ',
          self$`product_id`
          )
        },
        if (!is.null(self$`product_name`)) {
          sprintf(
          '"product_name":
            "%s"
                    ',
          self$`product_name`
          )
        },
        if (!is.null(self$`product_price`)) {
          sprintf(
          '"product_price":
            "%s"
                    ',
          self$`product_price`
          )
        },
        if (!is.null(self$`product_quantity`)) {
          sprintf(
          '"product_quantity":
            %d
                    ',
          self$`product_quantity`
          )
        },
        if (!is.null(self$`product_variant`)) {
          sprintf(
          '"product_variant":
            "%s"
                    ',
          self$`product_variant`
          )
        },
        if (!is.null(self$`product_variant_id`)) {
          sprintf(
          '"product_variant_id":
            "%s"
                    ',
          self$`product_variant_id`
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of LineItem
    #'
    #' @description
    #' Deserialize JSON string into an instance of LineItem
    #'
    #' @param input_json the JSON input
    #' @return the instance of LineItem
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`product_brand` <- this_object$`product_brand`
      self$`product_category` <- this_object$`product_category`
      self$`product_id` <- this_object$`product_id`
      self$`product_name` <- this_object$`product_name`
      self$`product_price` <- this_object$`product_price`
      self$`product_quantity` <- this_object$`product_quantity`
      self$`product_variant` <- this_object$`product_variant`
      self$`product_variant_id` <- this_object$`product_variant_id`
      self
    },
    #' Validate JSON input with respect to LineItem
    #'
    #' @description
    #' Validate JSON input with respect to LineItem and throw an exception if invalid
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
    #' @return String representation of LineItem
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
# LineItem$unlock()
#
## Below is an example to define the print function
# LineItem$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# LineItem$lock()

