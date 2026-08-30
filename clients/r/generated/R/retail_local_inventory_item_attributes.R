#' Create a new RetailLocalInventoryItemAttributes
#'
#' @description
#' Local inventory attributes for retail items (required fields for create/upsert)
#'
#' @docType class
#' @title RetailLocalInventoryItemAttributes
#' @description RetailLocalInventoryItemAttributes Class
#' @format An \code{R6Class} generator object
#' @field ad_link Ad link for the item character [optional]
#' @field availability Availability status of the item \link{ItemAvailability}
#' @field price The price of the product. It supports the following formats, \"49.99 USD\", \"49.99USD\" and \"49.99\". If the currency is not included, we default to US dollars. character
#' @field sale_price The sale price of the product. It supports the following formats, \"24.99 USD\", \"24.99USD\" and \"24.99\". If the currency is not included, we default to US dollars. character [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
RetailLocalInventoryItemAttributes <- R6::R6Class(
  "RetailLocalInventoryItemAttributes",
  public = list(
    `ad_link` = NULL,
    `availability` = NULL,
    `price` = NULL,
    `sale_price` = NULL,

    #' @description
    #' Initialize a new RetailLocalInventoryItemAttributes class.
    #'
    #' @param availability Availability status of the item
    #' @param price The price of the product. It supports the following formats, \"49.99 USD\", \"49.99USD\" and \"49.99\". If the currency is not included, we default to US dollars.
    #' @param ad_link Ad link for the item
    #' @param sale_price The sale price of the product. It supports the following formats, \"24.99 USD\", \"24.99USD\" and \"24.99\". If the currency is not included, we default to US dollars.
    #' @param ... Other optional arguments.
    initialize = function(`availability`, `price`, `ad_link` = NULL, `sale_price` = NULL, ...) {
      if (!missing(`availability`)) {
        if (!(`availability` %in% c())) {
          stop(paste("Error! \"", `availability`, "\" cannot be assigned to `availability`. Must be .", sep = ""))
        }
        stopifnot(R6::is.R6(`availability`))
        self$`availability` <- `availability`
      }
      if (!missing(`price`)) {
        if (!(is.character(`price`) && length(`price`) == 1)) {
          stop(paste("Error! Invalid data for `price`. Must be a string:", `price`))
        }
        self$`price` <- `price`
      }
      if (!is.null(`ad_link`)) {
        if (!(is.character(`ad_link`) && length(`ad_link`) == 1)) {
          stop(paste("Error! Invalid data for `ad_link`. Must be a string:", `ad_link`))
        }
        self$`ad_link` <- `ad_link`
      }
      if (!is.null(`sale_price`)) {
        if (!(is.character(`sale_price`) && length(`sale_price`) == 1)) {
          stop(paste("Error! Invalid data for `sale_price`. Must be a string:", `sale_price`))
        }
        self$`sale_price` <- `sale_price`
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
    #' @return RetailLocalInventoryItemAttributes as a base R list.
    #' @examples
    #' # convert array of RetailLocalInventoryItemAttributes (x) to a data frame
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
    #' Convert RetailLocalInventoryItemAttributes to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      RetailLocalInventoryItemAttributesObject <- list()
      if (!is.null(self$`ad_link`)) {
        RetailLocalInventoryItemAttributesObject[["ad_link"]] <-
          self$`ad_link`
      }
      if (!is.null(self$`availability`)) {
        RetailLocalInventoryItemAttributesObject[["availability"]] <-
          self$extractSimpleType(self$`availability`)
      }
      if (!is.null(self$`price`)) {
        RetailLocalInventoryItemAttributesObject[["price"]] <-
          self$`price`
      }
      if (!is.null(self$`sale_price`)) {
        RetailLocalInventoryItemAttributesObject[["sale_price"]] <-
          self$`sale_price`
      }
      return(RetailLocalInventoryItemAttributesObject)
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
    #' Deserialize JSON string into an instance of RetailLocalInventoryItemAttributes
    #'
    #' @param input_json the JSON input
    #' @return the instance of RetailLocalInventoryItemAttributes
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`ad_link`)) {
        self$`ad_link` <- this_object$`ad_link`
      }
      if (!is.null(this_object$`availability`)) {
        `availability_object` <- ItemAvailability$new()
        `availability_object`$fromJSON(jsonlite::toJSON(this_object$`availability`, auto_unbox = TRUE, digits = NA))
        self$`availability` <- `availability_object`
      }
      if (!is.null(this_object$`price`)) {
        self$`price` <- this_object$`price`
      }
      if (!is.null(this_object$`sale_price`)) {
        self$`sale_price` <- this_object$`sale_price`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return RetailLocalInventoryItemAttributes in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of RetailLocalInventoryItemAttributes
    #'
    #' @param input_json the JSON input
    #' @return the instance of RetailLocalInventoryItemAttributes
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`ad_link` <- this_object$`ad_link`
      self$`availability` <- ItemAvailability$new()$fromJSON(jsonlite::toJSON(this_object$`availability`, auto_unbox = TRUE, digits = NA))
      self$`price` <- this_object$`price`
      self$`sale_price` <- this_object$`sale_price`
      self
    },

    #' @description
    #' Validate JSON input with respect to RetailLocalInventoryItemAttributes and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `availability`
      if (!is.null(input_json$`availability`)) {
        stopifnot(R6::is.R6(input_json$`availability`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for RetailLocalInventoryItemAttributes: the required field `availability` is missing."))
      }
      # check the required field `price`
      if (!is.null(input_json$`price`)) {
        if (!(is.character(input_json$`price`) && length(input_json$`price`) == 1)) {
          stop(paste("Error! Invalid data for `price`. Must be a string:", input_json$`price`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for RetailLocalInventoryItemAttributes: the required field `price` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of RetailLocalInventoryItemAttributes
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      # check if the required `availability` is null
      if (is.null(self$`availability`)) {
        return(FALSE)
      }

      # check if the required `price` is null
      if (is.null(self$`price`)) {
        return(FALSE)
      }

      TRUE
    },

    #' @description
    #' Return a list of invalid fields (if any).
    #'
    #' @return A list of invalid fields (if any).
    getInvalidFields = function() {
      invalid_fields <- list()
      # check if the required `availability` is null
      if (is.null(self$`availability`)) {
        invalid_fields["availability"] <- "Non-nullable required field `availability` cannot be null."
      }

      # check if the required `price` is null
      if (is.null(self$`price`)) {
        invalid_fields["price"] <- "Non-nullable required field `price` cannot be null."
      }

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
# RetailLocalInventoryItemAttributes$unlock()
#
## Below is an example to define the print function
# RetailLocalInventoryItemAttributes$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# RetailLocalInventoryItemAttributes$lock()

