#' Create a new InviteAssetsSummary
#'
#' @description
#' Ad accounts and profiles the member/partner will be granted access to with this invite/request.
#'
#' @docType class
#' @title InviteAssetsSummary
#' @description InviteAssetsSummary Class
#' @format An \code{R6Class} generator object
#' @field ad_accounts List of ad account IDs and respective permission levels that will be assigned. list(\link{InviteAssetsSummaryAdAccountsInner}) [optional]
#' @field profiles List of profile IDs and respective permission levels that will be assigned. list(\link{InviteAssetsSummaryProfilesInner}) [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
InviteAssetsSummary <- R6::R6Class(
  "InviteAssetsSummary",
  public = list(
    `ad_accounts` = NULL,
    `profiles` = NULL,

    #' @description
    #' Initialize a new InviteAssetsSummary class.
    #'
    #' @param ad_accounts List of ad account IDs and respective permission levels that will be assigned.
    #' @param profiles List of profile IDs and respective permission levels that will be assigned.
    #' @param ... Other optional arguments.
    initialize = function(`ad_accounts` = NULL, `profiles` = NULL, ...) {
      if (!is.null(`ad_accounts`)) {
        stopifnot(is.vector(`ad_accounts`), length(`ad_accounts`) != 0)
        sapply(`ad_accounts`, function(x) stopifnot(R6::is.R6(x)))
        self$`ad_accounts` <- `ad_accounts`
      }
      if (!is.null(`profiles`)) {
        stopifnot(is.vector(`profiles`), length(`profiles`) != 0)
        sapply(`profiles`, function(x) stopifnot(R6::is.R6(x)))
        self$`profiles` <- `profiles`
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
    #' @return InviteAssetsSummary as a base R list.
    #' @examples
    #' # convert array of InviteAssetsSummary (x) to a data frame
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
    #' Convert InviteAssetsSummary to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      InviteAssetsSummaryObject <- list()
      if (!is.null(self$`ad_accounts`)) {
        InviteAssetsSummaryObject[["ad_accounts"]] <-
          lapply(self$`ad_accounts`, function(x) x$toSimpleType())
      }
      if (!is.null(self$`profiles`)) {
        InviteAssetsSummaryObject[["profiles"]] <-
          lapply(self$`profiles`, function(x) x$toSimpleType())
      }
      return(InviteAssetsSummaryObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of InviteAssetsSummary
    #'
    #' @param input_json the JSON input
    #' @return the instance of InviteAssetsSummary
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`ad_accounts`)) {
        self$`ad_accounts` <- ApiClient$new()$deserializeObj(this_object$`ad_accounts`, "array[InviteAssetsSummaryAdAccountsInner]", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`profiles`)) {
        self$`profiles` <- ApiClient$new()$deserializeObj(this_object$`profiles`, "array[InviteAssetsSummaryProfilesInner]", loadNamespace("openapi"))
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return InviteAssetsSummary in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of InviteAssetsSummary
    #'
    #' @param input_json the JSON input
    #' @return the instance of InviteAssetsSummary
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`ad_accounts` <- ApiClient$new()$deserializeObj(this_object$`ad_accounts`, "array[InviteAssetsSummaryAdAccountsInner]", loadNamespace("openapi"))
      self$`profiles` <- ApiClient$new()$deserializeObj(this_object$`profiles`, "array[InviteAssetsSummaryProfilesInner]", loadNamespace("openapi"))
      self
    },

    #' @description
    #' Validate JSON input with respect to InviteAssetsSummary and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of InviteAssetsSummary
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
# InviteAssetsSummary$unlock()
#
## Below is an example to define the print function
# InviteAssetsSummary$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# InviteAssetsSummary$lock()

