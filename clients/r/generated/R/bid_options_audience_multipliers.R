#' Create a new BidOptionsAudienceMultipliers
#'
#' @description
#' This represents a mapping from Audience ID to a bid price change value. This is paired with the bid_multipliers schedule type  Values represent the change in bid price and can be positive or negative. For percentage changes, a value of 500.0 means a 5% change. For value changes, the amount represents the direct bid adjustment. All audience multipliers must be set at the same time. If a multiplier is not provided it is assumed to be 0 (no bid adjustment). The change must still remain between the range of 0 and 10.
#'
#' @docType class
#' @title BidOptionsAudienceMultipliers
#' @description BidOptionsAudienceMultipliers Class
#' @format An \code{R6Class} generator object
#' @field audience_id  character
#' @field multiplier  numeric
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
BidOptionsAudienceMultipliers <- R6::R6Class(
  "BidOptionsAudienceMultipliers",
  public = list(
    `audience_id` = NULL,
    `multiplier` = NULL,

    #' @description
    #' Initialize a new BidOptionsAudienceMultipliers class.
    #'
    #' @param audience_id audience_id
    #' @param multiplier multiplier
    #' @param ... Other optional arguments.
    initialize = function(`audience_id`, `multiplier`, ...) {
      if (!missing(`audience_id`)) {
        if (!(is.character(`audience_id`) && length(`audience_id`) == 1)) {
          stop(paste("Error! Invalid data for `audience_id`. Must be a string:", `audience_id`))
        }
        self$`audience_id` <- `audience_id`
      }
      if (!missing(`multiplier`)) {
        self$`multiplier` <- `multiplier`
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
    #' @return BidOptionsAudienceMultipliers as a base R list.
    #' @examples
    #' # convert array of BidOptionsAudienceMultipliers (x) to a data frame
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
    #' Convert BidOptionsAudienceMultipliers to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      BidOptionsAudienceMultipliersObject <- list()
      if (!is.null(self$`audience_id`)) {
        BidOptionsAudienceMultipliersObject[["audience_id"]] <-
          self$`audience_id`
      }
      if (!is.null(self$`multiplier`)) {
        BidOptionsAudienceMultipliersObject[["multiplier"]] <-
          self$`multiplier`
      }
      return(BidOptionsAudienceMultipliersObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of BidOptionsAudienceMultipliers
    #'
    #' @param input_json the JSON input
    #' @return the instance of BidOptionsAudienceMultipliers
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`audience_id`)) {
        self$`audience_id` <- this_object$`audience_id`
      }
      if (!is.null(this_object$`multiplier`)) {
        self$`multiplier` <- this_object$`multiplier`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return BidOptionsAudienceMultipliers in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of BidOptionsAudienceMultipliers
    #'
    #' @param input_json the JSON input
    #' @return the instance of BidOptionsAudienceMultipliers
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`audience_id` <- this_object$`audience_id`
      self$`multiplier` <- this_object$`multiplier`
      self
    },

    #' @description
    #' Validate JSON input with respect to BidOptionsAudienceMultipliers and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `audience_id`
      if (!is.null(input_json$`audience_id`)) {
        if (!(is.character(input_json$`audience_id`) && length(input_json$`audience_id`) == 1)) {
          stop(paste("Error! Invalid data for `audience_id`. Must be a string:", input_json$`audience_id`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for BidOptionsAudienceMultipliers: the required field `audience_id` is missing."))
      }
      # check the required field `multiplier`
      if (!is.null(input_json$`multiplier`)) {
      } else {
        stop(paste("The JSON input `", input, "` is invalid for BidOptionsAudienceMultipliers: the required field `multiplier` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of BidOptionsAudienceMultipliers
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      # check if the required `audience_id` is null
      if (is.null(self$`audience_id`)) {
        return(FALSE)
      }

      if (!str_detect(self$`audience_id`, "^\\d+$")) {
        return(FALSE)
      }

      # check if the required `multiplier` is null
      if (is.null(self$`multiplier`)) {
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
      # check if the required `audience_id` is null
      if (is.null(self$`audience_id`)) {
        invalid_fields["audience_id"] <- "Non-nullable required field `audience_id` cannot be null."
      }

      if (!str_detect(self$`audience_id`, "^\\d+$")) {
        invalid_fields["audience_id"] <- "Invalid value for `audience_id`, must conform to the pattern ^\\d+$."
      }

      # check if the required `multiplier` is null
      if (is.null(self$`multiplier`)) {
        invalid_fields["multiplier"] <- "Non-nullable required field `multiplier` cannot be null."
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
# BidOptionsAudienceMultipliers$unlock()
#
## Below is an example to define the print function
# BidOptionsAudienceMultipliers$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# BidOptionsAudienceMultipliers$lock()

