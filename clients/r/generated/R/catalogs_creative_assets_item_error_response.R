#' Create a new CatalogsCreativeAssetsItemErrorResponse
#'
#' @description
#' Object describing a creative assets item error
#'
#' @docType class
#' @title CatalogsCreativeAssetsItemErrorResponse
#' @description CatalogsCreativeAssetsItemErrorResponse Class
#' @format An \code{R6Class} generator object
#' @field catalog_type  character
#' @field creative_assets_id The catalog creative assets id in the merchant namespace character [optional]
#' @field errors Array with the errors for the item id requested list(\link{ItemValidationEvent})
#' @field item_response_kind Discriminator literal identifying this leaf inside an `ItemResponse` payload. character
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
CatalogsCreativeAssetsItemErrorResponse <- R6::R6Class(
  "CatalogsCreativeAssetsItemErrorResponse",
  public = list(
    `catalog_type` = NULL,
    `creative_assets_id` = NULL,
    `errors` = NULL,
    `item_response_kind` = NULL,

    #' @description
    #' Initialize a new CatalogsCreativeAssetsItemErrorResponse class.
    #'
    #' @param catalog_type catalog_type
    #' @param errors Array with the errors for the item id requested
    #' @param item_response_kind Discriminator literal identifying this leaf inside an `ItemResponse` payload.
    #' @param creative_assets_id The catalog creative assets id in the merchant namespace
    #' @param ... Other optional arguments.
    initialize = function(`catalog_type`, `errors`, `item_response_kind`, `creative_assets_id` = NULL, ...) {
      if (!missing(`catalog_type`)) {
        if (!(`catalog_type` %in% c("CREATIVE_ASSETS"))) {
          stop(paste("Error! \"", `catalog_type`, "\" cannot be assigned to `catalog_type`. Must be \"CREATIVE_ASSETS\".", sep = ""))
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
        if (!(`item_response_kind` %in% c("creative_assets_item_error"))) {
          stop(paste("Error! \"", `item_response_kind`, "\" cannot be assigned to `item_response_kind`. Must be \"creative_assets_item_error\".", sep = ""))
        }
        if (!(is.character(`item_response_kind`) && length(`item_response_kind`) == 1)) {
          stop(paste("Error! Invalid data for `item_response_kind`. Must be a string:", `item_response_kind`))
        }
        self$`item_response_kind` <- `item_response_kind`
      }
      if (!is.null(`creative_assets_id`)) {
        if (!(is.character(`creative_assets_id`) && length(`creative_assets_id`) == 1)) {
          stop(paste("Error! Invalid data for `creative_assets_id`. Must be a string:", `creative_assets_id`))
        }
        self$`creative_assets_id` <- `creative_assets_id`
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
    #' @return CatalogsCreativeAssetsItemErrorResponse as a base R list.
    #' @examples
    #' # convert array of CatalogsCreativeAssetsItemErrorResponse (x) to a data frame
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
    #' Convert CatalogsCreativeAssetsItemErrorResponse to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      CatalogsCreativeAssetsItemErrorResponseObject <- list()
      if (!is.null(self$`catalog_type`)) {
        CatalogsCreativeAssetsItemErrorResponseObject[["catalog_type"]] <-
          self$`catalog_type`
      }
      if (!is.null(self$`creative_assets_id`)) {
        CatalogsCreativeAssetsItemErrorResponseObject[["creative_assets_id"]] <-
          self$`creative_assets_id`
      }
      if (!is.null(self$`errors`)) {
        CatalogsCreativeAssetsItemErrorResponseObject[["errors"]] <-
          self$extractSimpleType(self$`errors`)
      }
      if (!is.null(self$`item_response_kind`)) {
        CatalogsCreativeAssetsItemErrorResponseObject[["item_response_kind"]] <-
          self$`item_response_kind`
      }
      return(CatalogsCreativeAssetsItemErrorResponseObject)
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
    #' Deserialize JSON string into an instance of CatalogsCreativeAssetsItemErrorResponse
    #'
    #' @param input_json the JSON input
    #' @return the instance of CatalogsCreativeAssetsItemErrorResponse
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`catalog_type`)) {
        if (!is.null(this_object$`catalog_type`) && !(this_object$`catalog_type` %in% c("CREATIVE_ASSETS"))) {
          stop(paste("Error! \"", this_object$`catalog_type`, "\" cannot be assigned to `catalog_type`. Must be \"CREATIVE_ASSETS\".", sep = ""))
        }
        self$`catalog_type` <- this_object$`catalog_type`
      }
      if (!is.null(this_object$`creative_assets_id`)) {
        self$`creative_assets_id` <- this_object$`creative_assets_id`
      }
      if (!is.null(this_object$`errors`)) {
        self$`errors` <- ApiClient$new()$deserializeObj(this_object$`errors`, "array[ItemValidationEvent]", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`item_response_kind`)) {
        if (!is.null(this_object$`item_response_kind`) && !(this_object$`item_response_kind` %in% c("creative_assets_item_error"))) {
          stop(paste("Error! \"", this_object$`item_response_kind`, "\" cannot be assigned to `item_response_kind`. Must be \"creative_assets_item_error\".", sep = ""))
        }
        self$`item_response_kind` <- this_object$`item_response_kind`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return CatalogsCreativeAssetsItemErrorResponse in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of CatalogsCreativeAssetsItemErrorResponse
    #'
    #' @param input_json the JSON input
    #' @return the instance of CatalogsCreativeAssetsItemErrorResponse
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`catalog_type`) && !(this_object$`catalog_type` %in% c("CREATIVE_ASSETS"))) {
        stop(paste("Error! \"", this_object$`catalog_type`, "\" cannot be assigned to `catalog_type`. Must be \"CREATIVE_ASSETS\".", sep = ""))
      }
      self$`catalog_type` <- this_object$`catalog_type`
      self$`creative_assets_id` <- this_object$`creative_assets_id`
      self$`errors` <- ApiClient$new()$deserializeObj(this_object$`errors`, "array[ItemValidationEvent]", loadNamespace("openapi"))
      if (!is.null(this_object$`item_response_kind`) && !(this_object$`item_response_kind` %in% c("creative_assets_item_error"))) {
        stop(paste("Error! \"", this_object$`item_response_kind`, "\" cannot be assigned to `item_response_kind`. Must be \"creative_assets_item_error\".", sep = ""))
      }
      self$`item_response_kind` <- this_object$`item_response_kind`
      self
    },

    #' @description
    #' Validate JSON input with respect to CatalogsCreativeAssetsItemErrorResponse and throw an exception if invalid
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
        stop(paste("The JSON input `", input, "` is invalid for CatalogsCreativeAssetsItemErrorResponse: the required field `catalog_type` is missing."))
      }
      # check the required field `errors`
      if (!is.null(input_json$`errors`)) {
        stopifnot(is.vector(input_json$`errors`), length(input_json$`errors`) != 0)
        tmp <- sapply(input_json$`errors`, function(x) stopifnot(R6::is.R6(x)))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for CatalogsCreativeAssetsItemErrorResponse: the required field `errors` is missing."))
      }
      # check the required field `item_response_kind`
      if (!is.null(input_json$`item_response_kind`)) {
        if (!(is.character(input_json$`item_response_kind`) && length(input_json$`item_response_kind`) == 1)) {
          stop(paste("Error! Invalid data for `item_response_kind`. Must be a string:", input_json$`item_response_kind`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for CatalogsCreativeAssetsItemErrorResponse: the required field `item_response_kind` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of CatalogsCreativeAssetsItemErrorResponse
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
# CatalogsCreativeAssetsItemErrorResponse$unlock()
#
## Below is an example to define the print function
# CatalogsCreativeAssetsItemErrorResponse$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# CatalogsCreativeAssetsItemErrorResponse$lock()

