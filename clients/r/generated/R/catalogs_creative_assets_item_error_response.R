#' Create a new CatalogsCreativeAssetsItemErrorResponse
#'
#' @description
#' Object describing a creative assets item error
#'
#' @docType class
#' @title CatalogsCreativeAssetsItemErrorResponse
#' @description CatalogsCreativeAssetsItemErrorResponse Class
#' @format An \code{R6Class} generator object
#' @field catalog_type  \link{CatalogsType}
#' @field creative_assets_id The catalog creative assets id in the merchant namespace character [optional]
#' @field errors Array with the errors for the item id requested list(\link{ItemValidationEvent}) [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
CatalogsCreativeAssetsItemErrorResponse <- R6::R6Class(
  "CatalogsCreativeAssetsItemErrorResponse",
  public = list(
    `catalog_type` = NULL,
    `creative_assets_id` = NULL,
    `errors` = NULL,

    #' @description
    #' Initialize a new CatalogsCreativeAssetsItemErrorResponse class.
    #'
    #' @param catalog_type catalog_type
    #' @param creative_assets_id The catalog creative assets id in the merchant namespace
    #' @param errors Array with the errors for the item id requested
    #' @param ... Other optional arguments.
    initialize = function(`catalog_type`, `creative_assets_id` = NULL, `errors` = NULL, ...) {
      if (!missing(`catalog_type`)) {
        if (!(`catalog_type` %in% c())) {
          stop(paste("Error! \"", `catalog_type`, "\" cannot be assigned to `catalog_type`. Must be .", sep = ""))
        }
        stopifnot(R6::is.R6(`catalog_type`))
        self$`catalog_type` <- `catalog_type`
      }
      if (!is.null(`creative_assets_id`)) {
        if (!(is.character(`creative_assets_id`) && length(`creative_assets_id`) == 1)) {
          stop(paste("Error! Invalid data for `creative_assets_id`. Must be a string:", `creative_assets_id`))
        }
        self$`creative_assets_id` <- `creative_assets_id`
      }
      if (!is.null(`errors`)) {
        stopifnot(is.vector(`errors`), length(`errors`) != 0)
        sapply(`errors`, function(x) stopifnot(R6::is.R6(x)))
        self$`errors` <- `errors`
      }
    },

    #' @description
    #' To JSON String
    #'
    #' @return CatalogsCreativeAssetsItemErrorResponse in JSON format
    toJSON = function() {
      CatalogsCreativeAssetsItemErrorResponseObject <- list()
      if (!is.null(self$`catalog_type`)) {
        CatalogsCreativeAssetsItemErrorResponseObject[["catalog_type"]] <-
          self$`catalog_type`$toJSON()
      }
      if (!is.null(self$`creative_assets_id`)) {
        CatalogsCreativeAssetsItemErrorResponseObject[["creative_assets_id"]] <-
          self$`creative_assets_id`
      }
      if (!is.null(self$`errors`)) {
        CatalogsCreativeAssetsItemErrorResponseObject[["errors"]] <-
          lapply(self$`errors`, function(x) x$toJSON())
      }
      CatalogsCreativeAssetsItemErrorResponseObject
    },

    #' @description
    #' Deserialize JSON string into an instance of CatalogsCreativeAssetsItemErrorResponse
    #'
    #' @param input_json the JSON input
    #' @return the instance of CatalogsCreativeAssetsItemErrorResponse
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`catalog_type`)) {
        `catalog_type_object` <- CatalogsType$new()
        `catalog_type_object`$fromJSON(jsonlite::toJSON(this_object$`catalog_type`, auto_unbox = TRUE, digits = NA))
        self$`catalog_type` <- `catalog_type_object`
      }
      if (!is.null(this_object$`creative_assets_id`)) {
        self$`creative_assets_id` <- this_object$`creative_assets_id`
      }
      if (!is.null(this_object$`errors`)) {
        self$`errors` <- ApiClient$new()$deserializeObj(this_object$`errors`, "array[ItemValidationEvent]", loadNamespace("openapi"))
      }
      self
    },

    #' @description
    #' To JSON String
    #'
    #' @return CatalogsCreativeAssetsItemErrorResponse in JSON format
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`catalog_type`)) {
          sprintf(
          '"catalog_type":
          %s
          ',
          jsonlite::toJSON(self$`catalog_type`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        },
        if (!is.null(self$`creative_assets_id`)) {
          sprintf(
          '"creative_assets_id":
            "%s"
                    ',
          self$`creative_assets_id`
          )
        },
        if (!is.null(self$`errors`)) {
          sprintf(
          '"errors":
          [%s]
',
          paste(sapply(self$`errors`, function(x) jsonlite::toJSON(x$toJSON(), auto_unbox = TRUE, digits = NA)), collapse = ",")
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },

    #' @description
    #' Deserialize JSON string into an instance of CatalogsCreativeAssetsItemErrorResponse
    #'
    #' @param input_json the JSON input
    #' @return the instance of CatalogsCreativeAssetsItemErrorResponse
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`catalog_type` <- CatalogsType$new()$fromJSON(jsonlite::toJSON(this_object$`catalog_type`, auto_unbox = TRUE, digits = NA))
      self$`creative_assets_id` <- this_object$`creative_assets_id`
      self$`errors` <- ApiClient$new()$deserializeObj(this_object$`errors`, "array[ItemValidationEvent]", loadNamespace("openapi"))
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
        stopifnot(R6::is.R6(input_json$`catalog_type`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for CatalogsCreativeAssetsItemErrorResponse: the required field `catalog_type` is missing."))
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

