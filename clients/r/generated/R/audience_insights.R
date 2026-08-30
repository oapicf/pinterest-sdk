#' Create a new AudienceInsights
#'
#' @description
#' Audience interests and demographics.
#'
#' @docType class
#' @title AudienceInsights
#' @description AudienceInsights Class
#' @format An \code{R6Class} generator object
#' @field categories Category interest distribution list(\link{AudienceCategory}) [optional]
#' @field date Generation date character [optional]
#' @field demographics  \link{AudienceDemographics} [optional]
#' @field size Population count. integer [optional]
#' @field size_is_upper_bound Indicates whether the audience size has been rounded up to the next highest upper boundary. character [optional]
#' @field type  \link{AudienceInsightType} [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
AudienceInsights <- R6::R6Class(
  "AudienceInsights",
  public = list(
    `categories` = NULL,
    `date` = NULL,
    `demographics` = NULL,
    `size` = NULL,
    `size_is_upper_bound` = NULL,
    `type` = NULL,

    #' @description
    #' Initialize a new AudienceInsights class.
    #'
    #' @param categories Category interest distribution
    #' @param date Generation date
    #' @param demographics demographics
    #' @param size Population count.
    #' @param size_is_upper_bound Indicates whether the audience size has been rounded up to the next highest upper boundary.
    #' @param type type
    #' @param ... Other optional arguments.
    initialize = function(`categories` = NULL, `date` = NULL, `demographics` = NULL, `size` = NULL, `size_is_upper_bound` = NULL, `type` = NULL, ...) {
      if (!is.null(`categories`)) {
        stopifnot(is.vector(`categories`), length(`categories`) != 0)
        sapply(`categories`, function(x) stopifnot(R6::is.R6(x)))
        self$`categories` <- `categories`
      }
      if (!is.null(`date`)) {
        if (!(is.character(`date`) && length(`date`) == 1)) {
          stop(paste("Error! Invalid data for `date`. Must be a string:", `date`))
        }
        self$`date` <- `date`
      }
      if (!is.null(`demographics`)) {
        stopifnot(R6::is.R6(`demographics`))
        self$`demographics` <- `demographics`
      }
      if (!is.null(`size`)) {
        if (!(is.numeric(`size`) && length(`size`) == 1)) {
          stop(paste("Error! Invalid data for `size`. Must be an integer:", `size`))
        }
        self$`size` <- `size`
      }
      if (!is.null(`size_is_upper_bound`)) {
        if (!(is.logical(`size_is_upper_bound`) && length(`size_is_upper_bound`) == 1)) {
          stop(paste("Error! Invalid data for `size_is_upper_bound`. Must be a boolean:", `size_is_upper_bound`))
        }
        self$`size_is_upper_bound` <- `size_is_upper_bound`
      }
      if (!is.null(`type`)) {
        if (!(`type` %in% c())) {
          stop(paste("Error! \"", `type`, "\" cannot be assigned to `type`. Must be .", sep = ""))
        }
        stopifnot(R6::is.R6(`type`))
        self$`type` <- `type`
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
    #' @return AudienceInsights as a base R list.
    #' @examples
    #' # convert array of AudienceInsights (x) to a data frame
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
    #' Convert AudienceInsights to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      AudienceInsightsObject <- list()
      if (!is.null(self$`categories`)) {
        AudienceInsightsObject[["categories"]] <-
          self$extractSimpleType(self$`categories`)
      }
      if (!is.null(self$`date`)) {
        AudienceInsightsObject[["date"]] <-
          self$`date`
      }
      if (!is.null(self$`demographics`)) {
        AudienceInsightsObject[["demographics"]] <-
          self$extractSimpleType(self$`demographics`)
      }
      if (!is.null(self$`size`)) {
        AudienceInsightsObject[["size"]] <-
          self$`size`
      }
      if (!is.null(self$`size_is_upper_bound`)) {
        AudienceInsightsObject[["size_is_upper_bound"]] <-
          self$`size_is_upper_bound`
      }
      if (!is.null(self$`type`)) {
        AudienceInsightsObject[["type"]] <-
          self$extractSimpleType(self$`type`)
      }
      return(AudienceInsightsObject)
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
    #' Deserialize JSON string into an instance of AudienceInsights
    #'
    #' @param input_json the JSON input
    #' @return the instance of AudienceInsights
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`categories`)) {
        self$`categories` <- ApiClient$new()$deserializeObj(this_object$`categories`, "array[AudienceCategory]", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`date`)) {
        self$`date` <- this_object$`date`
      }
      if (!is.null(this_object$`demographics`)) {
        `demographics_object` <- AudienceDemographics$new()
        `demographics_object`$fromJSON(jsonlite::toJSON(this_object$`demographics`, auto_unbox = TRUE, digits = NA))
        self$`demographics` <- `demographics_object`
      }
      if (!is.null(this_object$`size`)) {
        self$`size` <- this_object$`size`
      }
      if (!is.null(this_object$`size_is_upper_bound`)) {
        self$`size_is_upper_bound` <- this_object$`size_is_upper_bound`
      }
      if (!is.null(this_object$`type`)) {
        `type_object` <- AudienceInsightType$new()
        `type_object`$fromJSON(jsonlite::toJSON(this_object$`type`, auto_unbox = TRUE, digits = NA))
        self$`type` <- `type_object`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return AudienceInsights in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of AudienceInsights
    #'
    #' @param input_json the JSON input
    #' @return the instance of AudienceInsights
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`categories` <- ApiClient$new()$deserializeObj(this_object$`categories`, "array[AudienceCategory]", loadNamespace("openapi"))
      self$`date` <- this_object$`date`
      self$`demographics` <- AudienceDemographics$new()$fromJSON(jsonlite::toJSON(this_object$`demographics`, auto_unbox = TRUE, digits = NA))
      self$`size` <- this_object$`size`
      self$`size_is_upper_bound` <- this_object$`size_is_upper_bound`
      self$`type` <- AudienceInsightType$new()$fromJSON(jsonlite::toJSON(this_object$`type`, auto_unbox = TRUE, digits = NA))
      self
    },

    #' @description
    #' Validate JSON input with respect to AudienceInsights and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of AudienceInsights
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      if (!str_detect(self$`date`, "^\\d{4}-\\d{2}-\\d{2}$")) {
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
      if (!str_detect(self$`date`, "^\\d{4}-\\d{2}-\\d{2}$")) {
        invalid_fields["date"] <- "Invalid value for `date`, must conform to the pattern ^\\d{4}-\\d{2}-\\d{2}$."
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
# AudienceInsights$unlock()
#
## Below is an example to define the print function
# AudienceInsights$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# AudienceInsights$lock()

