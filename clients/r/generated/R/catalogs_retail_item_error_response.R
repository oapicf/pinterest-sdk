#' Create a new CatalogsRetailItemErrorResponse
#'
#' @description
#' Object describing a retail item error
#'
#' @docType class
#' @title CatalogsRetailItemErrorResponse
#' @description CatalogsRetailItemErrorResponse Class
#' @format An \code{R6Class} generator object
#' @field catalog_type  \link{CatalogsType}
#' @field item_id The catalog item id in the merchant namespace character [optional]
#' @field errors Array with the errors for the item id requested list(\link{ItemValidationEvent}) [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
CatalogsRetailItemErrorResponse <- R6::R6Class(
  "CatalogsRetailItemErrorResponse",
  public = list(
    `catalog_type` = NULL,
    `item_id` = NULL,
    `errors` = NULL,
    #' Initialize a new CatalogsRetailItemErrorResponse class.
    #'
    #' @description
    #' Initialize a new CatalogsRetailItemErrorResponse class.
    #'
    #' @param catalog_type catalog_type
    #' @param item_id The catalog item id in the merchant namespace
    #' @param errors Array with the errors for the item id requested
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`catalog_type`, `item_id` = NULL, `errors` = NULL, ...) {
      if (!missing(`catalog_type`)) {
        if (!(`catalog_type` %in% c())) {
          stop(paste("Error! \"", `catalog_type`, "\" cannot be assigned to `catalog_type`. Must be .", sep = ""))
        }
        stopifnot(R6::is.R6(`catalog_type`))
        self$`catalog_type` <- `catalog_type`
      }
      if (!is.null(`item_id`)) {
        if (!(is.character(`item_id`) && length(`item_id`) == 1)) {
          stop(paste("Error! Invalid data for `item_id`. Must be a string:", `item_id`))
        }
        self$`item_id` <- `item_id`
      }
      if (!is.null(`errors`)) {
        stopifnot(is.vector(`errors`), length(`errors`) != 0)
        sapply(`errors`, function(x) stopifnot(R6::is.R6(x)))
        self$`errors` <- `errors`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return CatalogsRetailItemErrorResponse in JSON format
    #' @export
    toJSON = function() {
      CatalogsRetailItemErrorResponseObject <- list()
      if (!is.null(self$`catalog_type`)) {
        CatalogsRetailItemErrorResponseObject[["catalog_type"]] <-
          self$`catalog_type`$toJSON()
      }
      if (!is.null(self$`item_id`)) {
        CatalogsRetailItemErrorResponseObject[["item_id"]] <-
          self$`item_id`
      }
      if (!is.null(self$`errors`)) {
        CatalogsRetailItemErrorResponseObject[["errors"]] <-
          lapply(self$`errors`, function(x) x$toJSON())
      }
      CatalogsRetailItemErrorResponseObject
    },
    #' Deserialize JSON string into an instance of CatalogsRetailItemErrorResponse
    #'
    #' @description
    #' Deserialize JSON string into an instance of CatalogsRetailItemErrorResponse
    #'
    #' @param input_json the JSON input
    #' @return the instance of CatalogsRetailItemErrorResponse
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`catalog_type`)) {
        `catalog_type_object` <- CatalogsType$new()
        `catalog_type_object`$fromJSON(jsonlite::toJSON(this_object$`catalog_type`, auto_unbox = TRUE, digits = NA))
        self$`catalog_type` <- `catalog_type_object`
      }
      if (!is.null(this_object$`item_id`)) {
        self$`item_id` <- this_object$`item_id`
      }
      if (!is.null(this_object$`errors`)) {
        self$`errors` <- ApiClient$new()$deserializeObj(this_object$`errors`, "array[ItemValidationEvent]", loadNamespace("openapi"))
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return CatalogsRetailItemErrorResponse in JSON format
    #' @export
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
        if (!is.null(self$`item_id`)) {
          sprintf(
          '"item_id":
            "%s"
                    ',
          self$`item_id`
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
    #' Deserialize JSON string into an instance of CatalogsRetailItemErrorResponse
    #'
    #' @description
    #' Deserialize JSON string into an instance of CatalogsRetailItemErrorResponse
    #'
    #' @param input_json the JSON input
    #' @return the instance of CatalogsRetailItemErrorResponse
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`catalog_type` <- CatalogsType$new()$fromJSON(jsonlite::toJSON(this_object$`catalog_type`, auto_unbox = TRUE, digits = NA))
      self$`item_id` <- this_object$`item_id`
      self$`errors` <- ApiClient$new()$deserializeObj(this_object$`errors`, "array[ItemValidationEvent]", loadNamespace("openapi"))
      self
    },
    #' Validate JSON input with respect to CatalogsRetailItemErrorResponse
    #'
    #' @description
    #' Validate JSON input with respect to CatalogsRetailItemErrorResponse and throw an exception if invalid
    #'
    #' @param input the JSON input
    #' @export
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `catalog_type`
      if (!is.null(input_json$`catalog_type`)) {
        stopifnot(R6::is.R6(input_json$`catalog_type`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for CatalogsRetailItemErrorResponse: the required field `catalog_type` is missing."))
      }
    },
    #' To string (JSON format)
    #'
    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of CatalogsRetailItemErrorResponse
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
      # check if the required `catalog_type` is null
      if (is.null(self$`catalog_type`)) {
        return(FALSE)
      }

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
      # check if the required `catalog_type` is null
      if (is.null(self$`catalog_type`)) {
        invalid_fields["catalog_type"] <- "Non-nullable required field `catalog_type` cannot be null."
      }

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
# CatalogsRetailItemErrorResponse$unlock()
#
## Below is an example to define the print function
# CatalogsRetailItemErrorResponse$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# CatalogsRetailItemErrorResponse$lock()

