#' Create a new CatalogsRetailItemErrorResponse
#'
#' @description
#' Object describing a retail item error
#'
#' @docType class
#' @title CatalogsRetailItemErrorResponse
#' @description CatalogsRetailItemErrorResponse Class
#' @format An \code{R6Class} generator object
#' @field catalog_type  character
#' @field errors Array with the errors for the item id requested list(\link{ItemValidationEvent})
#' @field item_id The catalog item id in the merchant namespace character [optional]
#' @field item_response_kind Discriminator literal identifying this leaf inside an `ItemResponse` payload. character
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
CatalogsRetailItemErrorResponse <- R6::R6Class(
  "CatalogsRetailItemErrorResponse",
  public = list(
    `catalog_type` = NULL,
    `errors` = NULL,
    `item_id` = NULL,
    `item_response_kind` = NULL,

    #' @description
    #' Initialize a new CatalogsRetailItemErrorResponse class.
    #'
    #' @param catalog_type catalog_type
    #' @param errors Array with the errors for the item id requested
    #' @param item_response_kind Discriminator literal identifying this leaf inside an `ItemResponse` payload.
    #' @param item_id The catalog item id in the merchant namespace
    #' @param ... Other optional arguments.
    initialize = function(`catalog_type`, `errors`, `item_response_kind`, `item_id` = NULL, ...) {
      if (!missing(`catalog_type`)) {
        if (!(`catalog_type` %in% c("RETAIL"))) {
          stop(paste("Error! \"", `catalog_type`, "\" cannot be assigned to `catalog_type`. Must be \"RETAIL\".", sep = ""))
        }
        if (!(is.character(`catalog_type`) && length(`catalog_type`) == 1)) {
          stop(paste("Error! Invalid data for `catalog_type`. Must be a string:", `catalog_type`))
        }
        self$`catalog_type` <- `catalog_type`
      }
      if (!missing(`errors`)) {
        stopifnot(is.vector(`errors`), length(`errors`) != 0)
        sapply(`errors`, function(x) stopifnot(R6::is.R6(x)))
        self$`errors` <- `errors`
      }
      if (!missing(`item_response_kind`)) {
        if (!(`item_response_kind` %in% c("retail_item_error"))) {
          stop(paste("Error! \"", `item_response_kind`, "\" cannot be assigned to `item_response_kind`. Must be \"retail_item_error\".", sep = ""))
        }
        if (!(is.character(`item_response_kind`) && length(`item_response_kind`) == 1)) {
          stop(paste("Error! Invalid data for `item_response_kind`. Must be a string:", `item_response_kind`))
        }
        self$`item_response_kind` <- `item_response_kind`
      }
      if (!is.null(`item_id`)) {
        if (!(is.character(`item_id`) && length(`item_id`) == 1)) {
          stop(paste("Error! Invalid data for `item_id`. Must be a string:", `item_id`))
        }
        self$`item_id` <- `item_id`
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
    #' @return CatalogsRetailItemErrorResponse as a base R list.
    #' @examples
    #' # convert array of CatalogsRetailItemErrorResponse (x) to a data frame
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
    #' Convert CatalogsRetailItemErrorResponse to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      CatalogsRetailItemErrorResponseObject <- list()
      if (!is.null(self$`catalog_type`)) {
        CatalogsRetailItemErrorResponseObject[["catalog_type"]] <-
          self$`catalog_type`
      }
      if (!is.null(self$`errors`)) {
        CatalogsRetailItemErrorResponseObject[["errors"]] <-
          self$extractSimpleType(self$`errors`)
      }
      if (!is.null(self$`item_id`)) {
        CatalogsRetailItemErrorResponseObject[["item_id"]] <-
          self$`item_id`
      }
      if (!is.null(self$`item_response_kind`)) {
        CatalogsRetailItemErrorResponseObject[["item_response_kind"]] <-
          self$`item_response_kind`
      }
      return(CatalogsRetailItemErrorResponseObject)
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
    #' Deserialize JSON string into an instance of CatalogsRetailItemErrorResponse
    #'
    #' @param input_json the JSON input
    #' @return the instance of CatalogsRetailItemErrorResponse
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`catalog_type`)) {
        if (!is.null(this_object$`catalog_type`) && !(this_object$`catalog_type` %in% c("RETAIL"))) {
          stop(paste("Error! \"", this_object$`catalog_type`, "\" cannot be assigned to `catalog_type`. Must be \"RETAIL\".", sep = ""))
        }
        self$`catalog_type` <- this_object$`catalog_type`
      }
      if (!is.null(this_object$`errors`)) {
        self$`errors` <- ApiClient$new()$deserializeObj(this_object$`errors`, "array[ItemValidationEvent]", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`item_id`)) {
        self$`item_id` <- this_object$`item_id`
      }
      if (!is.null(this_object$`item_response_kind`)) {
        if (!is.null(this_object$`item_response_kind`) && !(this_object$`item_response_kind` %in% c("retail_item_error"))) {
          stop(paste("Error! \"", this_object$`item_response_kind`, "\" cannot be assigned to `item_response_kind`. Must be \"retail_item_error\".", sep = ""))
        }
        self$`item_response_kind` <- this_object$`item_response_kind`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return CatalogsRetailItemErrorResponse in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of CatalogsRetailItemErrorResponse
    #'
    #' @param input_json the JSON input
    #' @return the instance of CatalogsRetailItemErrorResponse
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`catalog_type`) && !(this_object$`catalog_type` %in% c("RETAIL"))) {
        stop(paste("Error! \"", this_object$`catalog_type`, "\" cannot be assigned to `catalog_type`. Must be \"RETAIL\".", sep = ""))
      }
      self$`catalog_type` <- this_object$`catalog_type`
      self$`errors` <- ApiClient$new()$deserializeObj(this_object$`errors`, "array[ItemValidationEvent]", loadNamespace("openapi"))
      self$`item_id` <- this_object$`item_id`
      if (!is.null(this_object$`item_response_kind`) && !(this_object$`item_response_kind` %in% c("retail_item_error"))) {
        stop(paste("Error! \"", this_object$`item_response_kind`, "\" cannot be assigned to `item_response_kind`. Must be \"retail_item_error\".", sep = ""))
      }
      self$`item_response_kind` <- this_object$`item_response_kind`
      self
    },

    #' @description
    #' Validate JSON input with respect to CatalogsRetailItemErrorResponse and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `catalog_type`
      if (!is.null(input_json$`catalog_type`)) {
        if (!(is.character(input_json$`catalog_type`) && length(input_json$`catalog_type`) == 1)) {
          stop(paste("Error! Invalid data for `catalog_type`. Must be a string:", input_json$`catalog_type`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for CatalogsRetailItemErrorResponse: the required field `catalog_type` is missing."))
      }
      # check the required field `errors`
      if (!is.null(input_json$`errors`)) {
        stopifnot(is.vector(input_json$`errors`), length(input_json$`errors`) != 0)
        tmp <- sapply(input_json$`errors`, function(x) stopifnot(R6::is.R6(x)))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for CatalogsRetailItemErrorResponse: the required field `errors` is missing."))
      }
      # check the required field `item_response_kind`
      if (!is.null(input_json$`item_response_kind`)) {
        if (!(is.character(input_json$`item_response_kind`) && length(input_json$`item_response_kind`) == 1)) {
          stop(paste("Error! Invalid data for `item_response_kind`. Must be a string:", input_json$`item_response_kind`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for CatalogsRetailItemErrorResponse: the required field `item_response_kind` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of CatalogsRetailItemErrorResponse
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      # check if the required `catalog_type` is null
      if (is.null(self$`catalog_type`)) {
        return(FALSE)
      }

      # check if the required `errors` is null
      if (is.null(self$`errors`)) {
        return(FALSE)
      }

      # check if the required `item_response_kind` is null
      if (is.null(self$`item_response_kind`)) {
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
      # check if the required `catalog_type` is null
      if (is.null(self$`catalog_type`)) {
        invalid_fields["catalog_type"] <- "Non-nullable required field `catalog_type` cannot be null."
      }

      # check if the required `errors` is null
      if (is.null(self$`errors`)) {
        invalid_fields["errors"] <- "Non-nullable required field `errors` cannot be null."
      }

      # check if the required `item_response_kind` is null
      if (is.null(self$`item_response_kind`)) {
        invalid_fields["item_response_kind"] <- "Non-nullable required field `item_response_kind` cannot be null."
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
# CatalogsRetailItemErrorResponse$unlock()
#
## Below is an example to define the print function
# CatalogsRetailItemErrorResponse$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# CatalogsRetailItemErrorResponse$lock()

