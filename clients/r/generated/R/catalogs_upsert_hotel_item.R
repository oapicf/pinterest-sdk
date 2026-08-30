#' Create a new CatalogsUpsertHotelItem
#'
#' @description
#' A hotel item to be upserted.
#'
#' @docType class
#' @title CatalogsUpsertHotelItem
#' @description CatalogsUpsertHotelItem Class
#' @format An \code{R6Class} generator object
#' @field attributes  \link{CatalogsHotelAttributes}
#' @field hotel_id The catalog hotel id in the merchant namespace character
#' @field operation  character
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
CatalogsUpsertHotelItem <- R6::R6Class(
  "CatalogsUpsertHotelItem",
  public = list(
    `attributes` = NULL,
    `hotel_id` = NULL,
    `operation` = NULL,

    #' @description
    #' Initialize a new CatalogsUpsertHotelItem class.
    #'
    #' @param attributes attributes
    #' @param hotel_id The catalog hotel id in the merchant namespace
    #' @param operation operation
    #' @param ... Other optional arguments.
    initialize = function(`attributes`, `hotel_id`, `operation`, ...) {
      if (!missing(`attributes`)) {
        stopifnot(R6::is.R6(`attributes`))
        self$`attributes` <- `attributes`
      }
      if (!missing(`hotel_id`)) {
        if (!(is.character(`hotel_id`) && length(`hotel_id`) == 1)) {
          stop(paste("Error! Invalid data for `hotel_id`. Must be a string:", `hotel_id`))
        }
        self$`hotel_id` <- `hotel_id`
      }
      if (!missing(`operation`)) {
        if (!(`operation` %in% c("UPSERT"))) {
          stop(paste("Error! \"", `operation`, "\" cannot be assigned to `operation`. Must be \"UPSERT\".", sep = ""))
        }
        if (!(is.character(`operation`) && length(`operation`) == 1)) {
          stop(paste("Error! Invalid data for `operation`. Must be a string:", `operation`))
        }
        self$`operation` <- `operation`
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
    #' @return CatalogsUpsertHotelItem as a base R list.
    #' @examples
    #' # convert array of CatalogsUpsertHotelItem (x) to a data frame
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
    #' Convert CatalogsUpsertHotelItem to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      CatalogsUpsertHotelItemObject <- list()
      if (!is.null(self$`attributes`)) {
        CatalogsUpsertHotelItemObject[["attributes"]] <-
          self$extractSimpleType(self$`attributes`)
      }
      if (!is.null(self$`hotel_id`)) {
        CatalogsUpsertHotelItemObject[["hotel_id"]] <-
          self$`hotel_id`
      }
      if (!is.null(self$`operation`)) {
        CatalogsUpsertHotelItemObject[["operation"]] <-
          self$`operation`
      }
      return(CatalogsUpsertHotelItemObject)
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
    #' Deserialize JSON string into an instance of CatalogsUpsertHotelItem
    #'
    #' @param input_json the JSON input
    #' @return the instance of CatalogsUpsertHotelItem
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`attributes`)) {
        `attributes_object` <- CatalogsHotelAttributes$new()
        `attributes_object`$fromJSON(jsonlite::toJSON(this_object$`attributes`, auto_unbox = TRUE, digits = NA))
        self$`attributes` <- `attributes_object`
      }
      if (!is.null(this_object$`hotel_id`)) {
        self$`hotel_id` <- this_object$`hotel_id`
      }
      if (!is.null(this_object$`operation`)) {
        if (!is.null(this_object$`operation`) && !(this_object$`operation` %in% c("UPSERT"))) {
          stop(paste("Error! \"", this_object$`operation`, "\" cannot be assigned to `operation`. Must be \"UPSERT\".", sep = ""))
        }
        self$`operation` <- this_object$`operation`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return CatalogsUpsertHotelItem in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of CatalogsUpsertHotelItem
    #'
    #' @param input_json the JSON input
    #' @return the instance of CatalogsUpsertHotelItem
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`attributes` <- CatalogsHotelAttributes$new()$fromJSON(jsonlite::toJSON(this_object$`attributes`, auto_unbox = TRUE, digits = NA))
      self$`hotel_id` <- this_object$`hotel_id`
      if (!is.null(this_object$`operation`) && !(this_object$`operation` %in% c("UPSERT"))) {
        stop(paste("Error! \"", this_object$`operation`, "\" cannot be assigned to `operation`. Must be \"UPSERT\".", sep = ""))
      }
      self$`operation` <- this_object$`operation`
      self
    },

    #' @description
    #' Validate JSON input with respect to CatalogsUpsertHotelItem and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `attributes`
      if (!is.null(input_json$`attributes`)) {
        stopifnot(R6::is.R6(input_json$`attributes`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for CatalogsUpsertHotelItem: the required field `attributes` is missing."))
      }
      # check the required field `hotel_id`
      if (!is.null(input_json$`hotel_id`)) {
        if (!(is.character(input_json$`hotel_id`) && length(input_json$`hotel_id`) == 1)) {
          stop(paste("Error! Invalid data for `hotel_id`. Must be a string:", input_json$`hotel_id`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for CatalogsUpsertHotelItem: the required field `hotel_id` is missing."))
      }
      # check the required field `operation`
      if (!is.null(input_json$`operation`)) {
        if (!(is.character(input_json$`operation`) && length(input_json$`operation`) == 1)) {
          stop(paste("Error! Invalid data for `operation`. Must be a string:", input_json$`operation`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for CatalogsUpsertHotelItem: the required field `operation` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of CatalogsUpsertHotelItem
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      # check if the required `attributes` is null
      if (is.null(self$`attributes`)) {
        return(FALSE)
      }

      # check if the required `hotel_id` is null
      if (is.null(self$`hotel_id`)) {
        return(FALSE)
      }

      # check if the required `operation` is null
      if (is.null(self$`operation`)) {
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
      # check if the required `attributes` is null
      if (is.null(self$`attributes`)) {
        invalid_fields["attributes"] <- "Non-nullable required field `attributes` cannot be null."
      }

      # check if the required `hotel_id` is null
      if (is.null(self$`hotel_id`)) {
        invalid_fields["hotel_id"] <- "Non-nullable required field `hotel_id` cannot be null."
      }

      # check if the required `operation` is null
      if (is.null(self$`operation`)) {
        invalid_fields["operation"] <- "Non-nullable required field `operation` cannot be null."
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
# CatalogsUpsertHotelItem$unlock()
#
## Below is an example to define the print function
# CatalogsUpsertHotelItem$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# CatalogsUpsertHotelItem$lock()

