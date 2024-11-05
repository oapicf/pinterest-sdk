#' Create a new BusinessPartnerAssetAccessGet200Response
#'
#' @description
#' BusinessPartnerAssetAccessGet200Response Class
#'
#' @docType class
#' @title BusinessPartnerAssetAccessGet200Response
#' @description BusinessPartnerAssetAccessGet200Response Class
#' @format An \code{R6Class} generator object
#' @field items List assets on which you granted access to your partner or assets on which your partner has granted you access. list(\link{GetPartnerAssetsResponse})
#' @field bookmark  character [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
BusinessPartnerAssetAccessGet200Response <- R6::R6Class(
  "BusinessPartnerAssetAccessGet200Response",
  public = list(
    `items` = NULL,
    `bookmark` = NULL,

    #' @description
    #' Initialize a new BusinessPartnerAssetAccessGet200Response class.
    #'
    #' @param items List assets on which you granted access to your partner or assets on which your partner has granted you access.
    #' @param bookmark bookmark
    #' @param ... Other optional arguments.
    initialize = function(`items`, `bookmark` = NULL, ...) {
      if (!missing(`items`)) {
        stopifnot(is.vector(`items`), length(`items`) != 0)
        sapply(`items`, function(x) stopifnot(R6::is.R6(x)))
        self$`items` <- `items`
      }
      if (!is.null(`bookmark`)) {
        if (!(is.character(`bookmark`) && length(`bookmark`) == 1)) {
          stop(paste("Error! Invalid data for `bookmark`. Must be a string:", `bookmark`))
        }
        self$`bookmark` <- `bookmark`
      }
    },

    #' @description
    #' To JSON String
    #'
    #' @return BusinessPartnerAssetAccessGet200Response in JSON format
    toJSON = function() {
      BusinessPartnerAssetAccessGet200ResponseObject <- list()
      if (!is.null(self$`items`)) {
        BusinessPartnerAssetAccessGet200ResponseObject[["items"]] <-
          lapply(self$`items`, function(x) x$toJSON())
      }
      if (!is.null(self$`bookmark`)) {
        BusinessPartnerAssetAccessGet200ResponseObject[["bookmark"]] <-
          self$`bookmark`
      }
      BusinessPartnerAssetAccessGet200ResponseObject
    },

    #' @description
    #' Deserialize JSON string into an instance of BusinessPartnerAssetAccessGet200Response
    #'
    #' @param input_json the JSON input
    #' @return the instance of BusinessPartnerAssetAccessGet200Response
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`items`)) {
        self$`items` <- ApiClient$new()$deserializeObj(this_object$`items`, "array[GetPartnerAssetsResponse]", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`bookmark`)) {
        self$`bookmark` <- this_object$`bookmark`
      }
      self
    },

    #' @description
    #' To JSON String
    #'
    #' @return BusinessPartnerAssetAccessGet200Response in JSON format
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`items`)) {
          sprintf(
          '"items":
          [%s]
',
          paste(sapply(self$`items`, function(x) jsonlite::toJSON(x$toJSON(), auto_unbox = TRUE, digits = NA)), collapse = ",")
          )
        },
        if (!is.null(self$`bookmark`)) {
          sprintf(
          '"bookmark":
            "%s"
                    ',
          self$`bookmark`
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },

    #' @description
    #' Deserialize JSON string into an instance of BusinessPartnerAssetAccessGet200Response
    #'
    #' @param input_json the JSON input
    #' @return the instance of BusinessPartnerAssetAccessGet200Response
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`items` <- ApiClient$new()$deserializeObj(this_object$`items`, "array[GetPartnerAssetsResponse]", loadNamespace("openapi"))
      self$`bookmark` <- this_object$`bookmark`
      self
    },

    #' @description
    #' Validate JSON input with respect to BusinessPartnerAssetAccessGet200Response and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `items`
      if (!is.null(input_json$`items`)) {
        stopifnot(is.vector(input_json$`items`), length(input_json$`items`) != 0)
        tmp <- sapply(input_json$`items`, function(x) stopifnot(R6::is.R6(x)))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for BusinessPartnerAssetAccessGet200Response: the required field `items` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of BusinessPartnerAssetAccessGet200Response
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      # check if the required `items` is null
      if (is.null(self$`items`)) {
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
      # check if the required `items` is null
      if (is.null(self$`items`)) {
        invalid_fields["items"] <- "Non-nullable required field `items` cannot be null."
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
# BusinessPartnerAssetAccessGet200Response$unlock()
#
## Below is an example to define the print function
# BusinessPartnerAssetAccessGet200Response$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# BusinessPartnerAssetAccessGet200Response$lock()

