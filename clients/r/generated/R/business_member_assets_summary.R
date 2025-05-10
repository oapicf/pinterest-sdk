#' Create a new BusinessMemberAssetsSummary
#'
#' @description
#' Ad accounts and profiles the business member/partner has access to.
#'
#' @docType class
#' @title BusinessMemberAssetsSummary
#' @description BusinessMemberAssetsSummary Class
#' @format An \code{R6Class} generator object
#' @field ad_accounts List of ad account IDs and respective permission levels. list(\link{BusinessMemberAssetsSummaryAdAccountsInner}) [optional]
#' @field profiles List of profile IDs and respective permission levels. list(\link{BusinessMemberAssetsSummaryProfilesInner}) [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
BusinessMemberAssetsSummary <- R6::R6Class(
  "BusinessMemberAssetsSummary",
  public = list(
    `ad_accounts` = NULL,
    `profiles` = NULL,

    #' @description
    #' Initialize a new BusinessMemberAssetsSummary class.
    #'
    #' @param ad_accounts List of ad account IDs and respective permission levels.
    #' @param profiles List of profile IDs and respective permission levels.
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
    #' @return BusinessMemberAssetsSummary as a base R list.
    #' @examples
    #' # convert array of BusinessMemberAssetsSummary (x) to a data frame
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
    #' Convert BusinessMemberAssetsSummary to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      BusinessMemberAssetsSummaryObject <- list()
      if (!is.null(self$`ad_accounts`)) {
        BusinessMemberAssetsSummaryObject[["ad_accounts"]] <-
          lapply(self$`ad_accounts`, function(x) x$toSimpleType())
      }
      if (!is.null(self$`profiles`)) {
        BusinessMemberAssetsSummaryObject[["profiles"]] <-
          lapply(self$`profiles`, function(x) x$toSimpleType())
      }
      return(BusinessMemberAssetsSummaryObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of BusinessMemberAssetsSummary
    #'
    #' @param input_json the JSON input
    #' @return the instance of BusinessMemberAssetsSummary
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`ad_accounts`)) {
        self$`ad_accounts` <- ApiClient$new()$deserializeObj(this_object$`ad_accounts`, "array[BusinessMemberAssetsSummaryAdAccountsInner]", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`profiles`)) {
        self$`profiles` <- ApiClient$new()$deserializeObj(this_object$`profiles`, "array[BusinessMemberAssetsSummaryProfilesInner]", loadNamespace("openapi"))
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return BusinessMemberAssetsSummary in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of BusinessMemberAssetsSummary
    #'
    #' @param input_json the JSON input
    #' @return the instance of BusinessMemberAssetsSummary
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`ad_accounts` <- ApiClient$new()$deserializeObj(this_object$`ad_accounts`, "array[BusinessMemberAssetsSummaryAdAccountsInner]", loadNamespace("openapi"))
      self$`profiles` <- ApiClient$new()$deserializeObj(this_object$`profiles`, "array[BusinessMemberAssetsSummaryProfilesInner]", loadNamespace("openapi"))
      self
    },

    #' @description
    #' Validate JSON input with respect to BusinessMemberAssetsSummary and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of BusinessMemberAssetsSummary
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
# BusinessMemberAssetsSummary$unlock()
#
## Below is an example to define the print function
# BusinessMemberAssetsSummary$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# BusinessMemberAssetsSummary$lock()

