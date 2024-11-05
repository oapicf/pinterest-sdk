#' Create a new CreateAssetAccessRequestBody
#'
#' @description
#' An object containing a list of all the asset access requests
#'
#' @docType class
#' @title CreateAssetAccessRequestBody
#' @description CreateAssetAccessRequestBody Class
#' @format An \code{R6Class} generator object
#' @field asset_requests  list(\link{CreateAssetAccessRequestBodyAssetRequestsInner})
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
CreateAssetAccessRequestBody <- R6::R6Class(
  "CreateAssetAccessRequestBody",
  public = list(
    `asset_requests` = NULL,

    #' @description
    #' Initialize a new CreateAssetAccessRequestBody class.
    #'
    #' @param asset_requests asset_requests
    #' @param ... Other optional arguments.
    initialize = function(`asset_requests`, ...) {
      if (!missing(`asset_requests`)) {
        stopifnot(is.vector(`asset_requests`), length(`asset_requests`) != 0)
        sapply(`asset_requests`, function(x) stopifnot(R6::is.R6(x)))
        self$`asset_requests` <- `asset_requests`
      }
    },

    #' @description
    #' To JSON String
    #'
    #' @return CreateAssetAccessRequestBody in JSON format
    toJSON = function() {
      CreateAssetAccessRequestBodyObject <- list()
      if (!is.null(self$`asset_requests`)) {
        CreateAssetAccessRequestBodyObject[["asset_requests"]] <-
          lapply(self$`asset_requests`, function(x) x$toJSON())
      }
      CreateAssetAccessRequestBodyObject
    },

    #' @description
    #' Deserialize JSON string into an instance of CreateAssetAccessRequestBody
    #'
    #' @param input_json the JSON input
    #' @return the instance of CreateAssetAccessRequestBody
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`asset_requests`)) {
        self$`asset_requests` <- ApiClient$new()$deserializeObj(this_object$`asset_requests`, "array[CreateAssetAccessRequestBodyAssetRequestsInner]", loadNamespace("openapi"))
      }
      self
    },

    #' @description
    #' To JSON String
    #'
    #' @return CreateAssetAccessRequestBody in JSON format
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`asset_requests`)) {
          sprintf(
          '"asset_requests":
          [%s]
',
          paste(sapply(self$`asset_requests`, function(x) jsonlite::toJSON(x$toJSON(), auto_unbox = TRUE, digits = NA)), collapse = ",")
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },

    #' @description
    #' Deserialize JSON string into an instance of CreateAssetAccessRequestBody
    #'
    #' @param input_json the JSON input
    #' @return the instance of CreateAssetAccessRequestBody
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`asset_requests` <- ApiClient$new()$deserializeObj(this_object$`asset_requests`, "array[CreateAssetAccessRequestBodyAssetRequestsInner]", loadNamespace("openapi"))
      self
    },

    #' @description
    #' Validate JSON input with respect to CreateAssetAccessRequestBody and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `asset_requests`
      if (!is.null(input_json$`asset_requests`)) {
        stopifnot(is.vector(input_json$`asset_requests`), length(input_json$`asset_requests`) != 0)
        tmp <- sapply(input_json$`asset_requests`, function(x) stopifnot(R6::is.R6(x)))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for CreateAssetAccessRequestBody: the required field `asset_requests` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of CreateAssetAccessRequestBody
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      # check if the required `asset_requests` is null
      if (is.null(self$`asset_requests`)) {
        return(FALSE)
      }

      if (length(self$`asset_requests`) > 100) {
        return(FALSE)
      }
      if (length(self$`asset_requests`) < 1) {
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
      # check if the required `asset_requests` is null
      if (is.null(self$`asset_requests`)) {
        invalid_fields["asset_requests"] <- "Non-nullable required field `asset_requests` cannot be null."
      }

      if (length(self$`asset_requests`) > 100) {
        invalid_fields["asset_requests"] <- "Invalid length for `asset_requests`, number of items must be less than or equal to 100."
      }
      if (length(self$`asset_requests`) < 1) {
        invalid_fields["asset_requests"] <- "Invalid length for ``, number of items must be greater than or equal to 1."
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
# CreateAssetAccessRequestBody$unlock()
#
## Below is an example to define the print function
# CreateAssetAccessRequestBody$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# CreateAssetAccessRequestBody$lock()

