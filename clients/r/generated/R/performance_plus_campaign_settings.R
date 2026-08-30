#' Create a new PerformancePlusCampaignSettings
#'
#' @description
#' Pinterest Performance+ campaign settings.
#'
#' @docType class
#' @title PerformancePlusCampaignSettings
#' @description PerformancePlusCampaignSettings Class
#' @format An \code{R6Class} generator object
#' @field boost_prospecting_ad_group_bid Whether to boost prospecting ad group bid. character [optional]
#' @field pinner_list_exclusions List of campaign-level exclusion pinner list IDs. list(character) [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
PerformancePlusCampaignSettings <- R6::R6Class(
  "PerformancePlusCampaignSettings",
  public = list(
    `boost_prospecting_ad_group_bid` = NULL,
    `pinner_list_exclusions` = NULL,

    #' @description
    #' Initialize a new PerformancePlusCampaignSettings class.
    #'
    #' @param boost_prospecting_ad_group_bid Whether to boost prospecting ad group bid.
    #' @param pinner_list_exclusions List of campaign-level exclusion pinner list IDs.
    #' @param ... Other optional arguments.
    initialize = function(`boost_prospecting_ad_group_bid` = NULL, `pinner_list_exclusions` = NULL, ...) {
      if (!is.null(`boost_prospecting_ad_group_bid`)) {
        if (!(is.logical(`boost_prospecting_ad_group_bid`) && length(`boost_prospecting_ad_group_bid`) == 1)) {
          stop(paste("Error! Invalid data for `boost_prospecting_ad_group_bid`. Must be a boolean:", `boost_prospecting_ad_group_bid`))
        }
        self$`boost_prospecting_ad_group_bid` <- `boost_prospecting_ad_group_bid`
      }
      if (!is.null(`pinner_list_exclusions`)) {
        stopifnot(is.vector(`pinner_list_exclusions`), length(`pinner_list_exclusions`) != 0)
        sapply(`pinner_list_exclusions`, function(x) stopifnot(is.character(x)))
        self$`pinner_list_exclusions` <- `pinner_list_exclusions`
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
    #' @return PerformancePlusCampaignSettings as a base R list.
    #' @examples
    #' # convert array of PerformancePlusCampaignSettings (x) to a data frame
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
    #' Convert PerformancePlusCampaignSettings to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      PerformancePlusCampaignSettingsObject <- list()
      if (!is.null(self$`boost_prospecting_ad_group_bid`)) {
        PerformancePlusCampaignSettingsObject[["boost_prospecting_ad_group_bid"]] <-
          self$`boost_prospecting_ad_group_bid`
      }
      if (!is.null(self$`pinner_list_exclusions`)) {
        PerformancePlusCampaignSettingsObject[["pinner_list_exclusions"]] <-
          self$`pinner_list_exclusions`
      }
      return(PerformancePlusCampaignSettingsObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of PerformancePlusCampaignSettings
    #'
    #' @param input_json the JSON input
    #' @return the instance of PerformancePlusCampaignSettings
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`boost_prospecting_ad_group_bid`)) {
        self$`boost_prospecting_ad_group_bid` <- this_object$`boost_prospecting_ad_group_bid`
      }
      if (!is.null(this_object$`pinner_list_exclusions`)) {
        self$`pinner_list_exclusions` <- ApiClient$new()$deserializeObj(this_object$`pinner_list_exclusions`, "array[character]", loadNamespace("openapi"))
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return PerformancePlusCampaignSettings in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of PerformancePlusCampaignSettings
    #'
    #' @param input_json the JSON input
    #' @return the instance of PerformancePlusCampaignSettings
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`boost_prospecting_ad_group_bid` <- this_object$`boost_prospecting_ad_group_bid`
      self$`pinner_list_exclusions` <- ApiClient$new()$deserializeObj(this_object$`pinner_list_exclusions`, "array[character]", loadNamespace("openapi"))
      self
    },

    #' @description
    #' Validate JSON input with respect to PerformancePlusCampaignSettings and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of PerformancePlusCampaignSettings
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
# PerformancePlusCampaignSettings$unlock()
#
## Below is an example to define the print function
# PerformancePlusCampaignSettings$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# PerformancePlusCampaignSettings$lock()

