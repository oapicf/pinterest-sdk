#' Create a new CampaignPlanningAdGroupAudienceSize
#'
#' @description
#' Range audience size for an ad group.
#'
#' @docType class
#' @title CampaignPlanningAdGroupAudienceSize
#' @description CampaignPlanningAdGroupAudienceSize Class
#' @format An \code{R6Class} generator object
#' @field count_lower Lower bound of the audience size estimate. integer [optional]
#' @field count_upper Upper bound of the audience size estimate. integer [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
CampaignPlanningAdGroupAudienceSize <- R6::R6Class(
  "CampaignPlanningAdGroupAudienceSize",
  public = list(
    `count_lower` = NULL,
    `count_upper` = NULL,

    #' @description
    #' Initialize a new CampaignPlanningAdGroupAudienceSize class.
    #'
    #' @param count_lower Lower bound of the audience size estimate.
    #' @param count_upper Upper bound of the audience size estimate.
    #' @param ... Other optional arguments.
    initialize = function(`count_lower` = NULL, `count_upper` = NULL, ...) {
      if (!is.null(`count_lower`)) {
        if (!(is.numeric(`count_lower`) && length(`count_lower`) == 1)) {
          stop(paste("Error! Invalid data for `count_lower`. Must be an integer:", `count_lower`))
        }
        self$`count_lower` <- `count_lower`
      }
      if (!is.null(`count_upper`)) {
        if (!(is.numeric(`count_upper`) && length(`count_upper`) == 1)) {
          stop(paste("Error! Invalid data for `count_upper`. Must be an integer:", `count_upper`))
        }
        self$`count_upper` <- `count_upper`
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
    #' @return CampaignPlanningAdGroupAudienceSize as a base R list.
    #' @examples
    #' # convert array of CampaignPlanningAdGroupAudienceSize (x) to a data frame
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
    #' Convert CampaignPlanningAdGroupAudienceSize to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      CampaignPlanningAdGroupAudienceSizeObject <- list()
      if (!is.null(self$`count_lower`)) {
        CampaignPlanningAdGroupAudienceSizeObject[["count_lower"]] <-
          self$`count_lower`
      }
      if (!is.null(self$`count_upper`)) {
        CampaignPlanningAdGroupAudienceSizeObject[["count_upper"]] <-
          self$`count_upper`
      }
      return(CampaignPlanningAdGroupAudienceSizeObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of CampaignPlanningAdGroupAudienceSize
    #'
    #' @param input_json the JSON input
    #' @return the instance of CampaignPlanningAdGroupAudienceSize
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`count_lower`)) {
        self$`count_lower` <- this_object$`count_lower`
      }
      if (!is.null(this_object$`count_upper`)) {
        self$`count_upper` <- this_object$`count_upper`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return CampaignPlanningAdGroupAudienceSize in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of CampaignPlanningAdGroupAudienceSize
    #'
    #' @param input_json the JSON input
    #' @return the instance of CampaignPlanningAdGroupAudienceSize
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`count_lower` <- this_object$`count_lower`
      self$`count_upper` <- this_object$`count_upper`
      self
    },

    #' @description
    #' Validate JSON input with respect to CampaignPlanningAdGroupAudienceSize and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of CampaignPlanningAdGroupAudienceSize
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      if (self$`count_lower` < 0) {
        return(FALSE)
      }

      if (self$`count_upper` < 0) {
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
      if (self$`count_lower` < 0) {
        invalid_fields["count_lower"] <- "Invalid value for `count_lower`, must be bigger than or equal to 0."
      }

      if (self$`count_upper` < 0) {
        invalid_fields["count_upper"] <- "Invalid value for `count_upper`, must be bigger than or equal to 0."
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
# CampaignPlanningAdGroupAudienceSize$unlock()
#
## Below is an example to define the print function
# CampaignPlanningAdGroupAudienceSize$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# CampaignPlanningAdGroupAudienceSize$lock()

