#' Create a new BulkCampaignDeliveryEstimatesResponse
#'
#' @description
#' Bulk campaign delivery estimates response.
#'
#' @docType class
#' @title BulkCampaignDeliveryEstimatesResponse
#' @description BulkCampaignDeliveryEstimatesResponse Class
#' @format An \code{R6Class} generator object
#' @field data Per-campaign delivery estimate results, in the same order as the request. list(\link{BulkCampaignDeliveryEstimatesItem})
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
BulkCampaignDeliveryEstimatesResponse <- R6::R6Class(
  "BulkCampaignDeliveryEstimatesResponse",
  public = list(
    `data` = NULL,

    #' @description
    #' Initialize a new BulkCampaignDeliveryEstimatesResponse class.
    #'
    #' @param data Per-campaign delivery estimate results, in the same order as the request.
    #' @param ... Other optional arguments.
    initialize = function(`data`, ...) {
      if (!missing(`data`)) {
        stopifnot(is.vector(`data`), length(`data`) != 0)
        sapply(`data`, function(x) stopifnot(R6::is.R6(x)))
        self$`data` <- `data`
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
    #' @return BulkCampaignDeliveryEstimatesResponse as a base R list.
    #' @examples
    #' # convert array of BulkCampaignDeliveryEstimatesResponse (x) to a data frame
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
    #' Convert BulkCampaignDeliveryEstimatesResponse to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      BulkCampaignDeliveryEstimatesResponseObject <- list()
      if (!is.null(self$`data`)) {
        BulkCampaignDeliveryEstimatesResponseObject[["data"]] <-
          self$extractSimpleType(self$`data`)
      }
      return(BulkCampaignDeliveryEstimatesResponseObject)
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
    #' Deserialize JSON string into an instance of BulkCampaignDeliveryEstimatesResponse
    #'
    #' @param input_json the JSON input
    #' @return the instance of BulkCampaignDeliveryEstimatesResponse
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`data`)) {
        self$`data` <- ApiClient$new()$deserializeObj(this_object$`data`, "array[BulkCampaignDeliveryEstimatesItem]", loadNamespace("openapi"))
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return BulkCampaignDeliveryEstimatesResponse in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of BulkCampaignDeliveryEstimatesResponse
    #'
    #' @param input_json the JSON input
    #' @return the instance of BulkCampaignDeliveryEstimatesResponse
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`data` <- ApiClient$new()$deserializeObj(this_object$`data`, "array[BulkCampaignDeliveryEstimatesItem]", loadNamespace("openapi"))
      self
    },

    #' @description
    #' Validate JSON input with respect to BulkCampaignDeliveryEstimatesResponse and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `data`
      if (!is.null(input_json$`data`)) {
        stopifnot(is.vector(input_json$`data`), length(input_json$`data`) != 0)
        tmp <- sapply(input_json$`data`, function(x) stopifnot(R6::is.R6(x)))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for BulkCampaignDeliveryEstimatesResponse: the required field `data` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of BulkCampaignDeliveryEstimatesResponse
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      # check if the required `data` is null
      if (is.null(self$`data`)) {
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
      # check if the required `data` is null
      if (is.null(self$`data`)) {
        invalid_fields["data"] <- "Non-nullable required field `data` cannot be null."
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
# BulkCampaignDeliveryEstimatesResponse$unlock()
#
## Below is an example to define the print function
# BulkCampaignDeliveryEstimatesResponse$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# BulkCampaignDeliveryEstimatesResponse$lock()

