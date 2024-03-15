#' Create a new CampaignCreateResponse
#'
#' @description
#' CampaignCreateResponse Class
#'
#' @docType class
#' @title CampaignCreateResponse
#' @description CampaignCreateResponse Class
#' @format An \code{R6Class} generator object
#' @field items  list(\link{CampaignCreateResponseItem}) [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
CampaignCreateResponse <- R6::R6Class(
  "CampaignCreateResponse",
  public = list(
    `items` = NULL,
    #' Initialize a new CampaignCreateResponse class.
    #'
    #' @description
    #' Initialize a new CampaignCreateResponse class.
    #'
    #' @param items items
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`items` = NULL, ...) {
      if (!is.null(`items`)) {
        stopifnot(is.vector(`items`), length(`items`) != 0)
        sapply(`items`, function(x) stopifnot(R6::is.R6(x)))
        self$`items` <- `items`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return CampaignCreateResponse in JSON format
    #' @export
    toJSON = function() {
      CampaignCreateResponseObject <- list()
      if (!is.null(self$`items`)) {
        CampaignCreateResponseObject[["items"]] <-
          lapply(self$`items`, function(x) x$toJSON())
      }
      CampaignCreateResponseObject
    },
    #' Deserialize JSON string into an instance of CampaignCreateResponse
    #'
    #' @description
    #' Deserialize JSON string into an instance of CampaignCreateResponse
    #'
    #' @param input_json the JSON input
    #' @return the instance of CampaignCreateResponse
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`items`)) {
        self$`items` <- ApiClient$new()$deserializeObj(this_object$`items`, "array[CampaignCreateResponseItem]", loadNamespace("openapi"))
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return CampaignCreateResponse in JSON format
    #' @export
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`items`)) {
          sprintf(
          '"items":
          [%s]
',
          paste(sapply(self$`items`, function(x) jsonlite::toJSON(x$toJSON(), auto_unbox = TRUE, digits = NA)), collapse = ",")
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of CampaignCreateResponse
    #'
    #' @description
    #' Deserialize JSON string into an instance of CampaignCreateResponse
    #'
    #' @param input_json the JSON input
    #' @return the instance of CampaignCreateResponse
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`items` <- ApiClient$new()$deserializeObj(this_object$`items`, "array[CampaignCreateResponseItem]", loadNamespace("openapi"))
      self
    },
    #' Validate JSON input with respect to CampaignCreateResponse
    #'
    #' @description
    #' Validate JSON input with respect to CampaignCreateResponse and throw an exception if invalid
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
    #' @return String representation of CampaignCreateResponse
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
# CampaignCreateResponse$unlock()
#
## Below is an example to define the print function
# CampaignCreateResponse$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# CampaignCreateResponse$lock()

