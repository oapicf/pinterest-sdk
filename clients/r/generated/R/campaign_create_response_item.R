#' Create a new CampaignCreateResponseItem
#'
#' @description
#' CampaignCreateResponseItem Class
#'
#' @docType class
#' @title CampaignCreateResponseItem
#' @description CampaignCreateResponseItem Class
#' @format An \code{R6Class} generator object
#' @field data  \link{CampaignCreateResponseData} [optional]
#' @field exceptions  list(\link{Exception}) [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
CampaignCreateResponseItem <- R6::R6Class(
  "CampaignCreateResponseItem",
  public = list(
    `data` = NULL,
    `exceptions` = NULL,

    #' @description
    #' Initialize a new CampaignCreateResponseItem class.
    #'
    #' @param data data
    #' @param exceptions exceptions
    #' @param ... Other optional arguments.
    initialize = function(`data` = NULL, `exceptions` = NULL, ...) {
      if (!is.null(`data`)) {
        stopifnot(R6::is.R6(`data`))
        self$`data` <- `data`
      }
      if (!is.null(`exceptions`)) {
        stopifnot(is.vector(`exceptions`), length(`exceptions`) != 0)
        sapply(`exceptions`, function(x) stopifnot(R6::is.R6(x)))
        self$`exceptions` <- `exceptions`
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
    #' @return CampaignCreateResponseItem as a base R list.
    #' @examples
    #' # convert array of CampaignCreateResponseItem (x) to a data frame
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
    #' Convert CampaignCreateResponseItem to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      CampaignCreateResponseItemObject <- list()
      if (!is.null(self$`data`)) {
        CampaignCreateResponseItemObject[["data"]] <-
          self$`data`$toSimpleType()
      }
      if (!is.null(self$`exceptions`)) {
        CampaignCreateResponseItemObject[["exceptions"]] <-
          lapply(self$`exceptions`, function(x) x$toSimpleType())
      }
      return(CampaignCreateResponseItemObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of CampaignCreateResponseItem
    #'
    #' @param input_json the JSON input
    #' @return the instance of CampaignCreateResponseItem
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`data`)) {
        `data_object` <- CampaignCreateResponseData$new()
        `data_object`$fromJSON(jsonlite::toJSON(this_object$`data`, auto_unbox = TRUE, digits = NA))
        self$`data` <- `data_object`
      }
      if (!is.null(this_object$`exceptions`)) {
        self$`exceptions` <- ApiClient$new()$deserializeObj(this_object$`exceptions`, "array[Exception]", loadNamespace("openapi"))
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return CampaignCreateResponseItem in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of CampaignCreateResponseItem
    #'
    #' @param input_json the JSON input
    #' @return the instance of CampaignCreateResponseItem
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`data` <- CampaignCreateResponseData$new()$fromJSON(jsonlite::toJSON(this_object$`data`, auto_unbox = TRUE, digits = NA))
      self$`exceptions` <- ApiClient$new()$deserializeObj(this_object$`exceptions`, "array[Exception]", loadNamespace("openapi"))
      self
    },

    #' @description
    #' Validate JSON input with respect to CampaignCreateResponseItem and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of CampaignCreateResponseItem
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      TRUE
    },

    #' @description
    #' Return a list of invalid fields (if any).
    #'
    #' @return A list of invalid fields (if any).
    getInvalidFields = function() {
      invalid_fields <- list()
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
# CampaignCreateResponseItem$unlock()
#
## Below is an example to define the print function
# CampaignCreateResponseItem$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# CampaignCreateResponseItem$lock()

