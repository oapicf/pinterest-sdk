#' Create a new CampaignPlanningPointEstimate
#'
#' @description
#' A JSON object that represents a single estimation point. An estimation point contains the expected budget used and the estimated result, Y, along with an expected range based for the budget.
#'
#' @docType class
#' @title CampaignPlanningPointEstimate
#' @description CampaignPlanningPointEstimate Class
#' @format An \code{R6Class} generator object
#' @field budget The budget value of the point. integer
#' @field double_y Y value as a decimal. numeric
#' @field max_y The maximum Y value of the point. integer
#' @field min_y The minimum Y value of the point. integer
#' @field y The expected Y value of the point. integer
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
CampaignPlanningPointEstimate <- R6::R6Class(
  "CampaignPlanningPointEstimate",
  public = list(
    `budget` = NULL,
    `double_y` = NULL,
    `max_y` = NULL,
    `min_y` = NULL,
    `y` = NULL,

    #' @description
    #' Initialize a new CampaignPlanningPointEstimate class.
    #'
    #' @param budget The budget value of the point.
    #' @param double_y Y value as a decimal.
    #' @param max_y The maximum Y value of the point.
    #' @param min_y The minimum Y value of the point.
    #' @param y The expected Y value of the point.
    #' @param ... Other optional arguments.
    initialize = function(`budget`, `double_y`, `max_y`, `min_y`, `y`, ...) {
      if (!missing(`budget`)) {
        if (!(is.numeric(`budget`) && length(`budget`) == 1)) {
          stop(paste("Error! Invalid data for `budget`. Must be an integer:", `budget`))
        }
        self$`budget` <- `budget`
      }
      if (!missing(`double_y`)) {
        if (!(is.numeric(`double_y`) && length(`double_y`) == 1)) {
          stop(paste("Error! Invalid data for `double_y`. Must be a number:", `double_y`))
        }
        self$`double_y` <- `double_y`
      }
      if (!missing(`max_y`)) {
        if (!(is.numeric(`max_y`) && length(`max_y`) == 1)) {
          stop(paste("Error! Invalid data for `max_y`. Must be an integer:", `max_y`))
        }
        self$`max_y` <- `max_y`
      }
      if (!missing(`min_y`)) {
        if (!(is.numeric(`min_y`) && length(`min_y`) == 1)) {
          stop(paste("Error! Invalid data for `min_y`. Must be an integer:", `min_y`))
        }
        self$`min_y` <- `min_y`
      }
      if (!missing(`y`)) {
        if (!(is.numeric(`y`) && length(`y`) == 1)) {
          stop(paste("Error! Invalid data for `y`. Must be an integer:", `y`))
        }
        self$`y` <- `y`
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
    #' @return CampaignPlanningPointEstimate as a base R list.
    #' @examples
    #' # convert array of CampaignPlanningPointEstimate (x) to a data frame
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
    #' Convert CampaignPlanningPointEstimate to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      CampaignPlanningPointEstimateObject <- list()
      if (!is.null(self$`budget`)) {
        CampaignPlanningPointEstimateObject[["budget"]] <-
          self$`budget`
      }
      if (!is.null(self$`double_y`)) {
        CampaignPlanningPointEstimateObject[["double_y"]] <-
          self$`double_y`
      }
      if (!is.null(self$`max_y`)) {
        CampaignPlanningPointEstimateObject[["max_y"]] <-
          self$`max_y`
      }
      if (!is.null(self$`min_y`)) {
        CampaignPlanningPointEstimateObject[["min_y"]] <-
          self$`min_y`
      }
      if (!is.null(self$`y`)) {
        CampaignPlanningPointEstimateObject[["y"]] <-
          self$`y`
      }
      return(CampaignPlanningPointEstimateObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of CampaignPlanningPointEstimate
    #'
    #' @param input_json the JSON input
    #' @return the instance of CampaignPlanningPointEstimate
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`budget`)) {
        self$`budget` <- this_object$`budget`
      }
      if (!is.null(this_object$`double_y`)) {
        self$`double_y` <- this_object$`double_y`
      }
      if (!is.null(this_object$`max_y`)) {
        self$`max_y` <- this_object$`max_y`
      }
      if (!is.null(this_object$`min_y`)) {
        self$`min_y` <- this_object$`min_y`
      }
      if (!is.null(this_object$`y`)) {
        self$`y` <- this_object$`y`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return CampaignPlanningPointEstimate in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of CampaignPlanningPointEstimate
    #'
    #' @param input_json the JSON input
    #' @return the instance of CampaignPlanningPointEstimate
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`budget` <- this_object$`budget`
      self$`double_y` <- this_object$`double_y`
      self$`max_y` <- this_object$`max_y`
      self$`min_y` <- this_object$`min_y`
      self$`y` <- this_object$`y`
      self
    },

    #' @description
    #' Validate JSON input with respect to CampaignPlanningPointEstimate and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `budget`
      if (!is.null(input_json$`budget`)) {
        if (!(is.numeric(input_json$`budget`) && length(input_json$`budget`) == 1)) {
          stop(paste("Error! Invalid data for `budget`. Must be an integer:", input_json$`budget`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for CampaignPlanningPointEstimate: the required field `budget` is missing."))
      }
      # check the required field `double_y`
      if (!is.null(input_json$`double_y`)) {
        if (!(is.numeric(input_json$`double_y`) && length(input_json$`double_y`) == 1)) {
          stop(paste("Error! Invalid data for `double_y`. Must be a number:", input_json$`double_y`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for CampaignPlanningPointEstimate: the required field `double_y` is missing."))
      }
      # check the required field `max_y`
      if (!is.null(input_json$`max_y`)) {
        if (!(is.numeric(input_json$`max_y`) && length(input_json$`max_y`) == 1)) {
          stop(paste("Error! Invalid data for `max_y`. Must be an integer:", input_json$`max_y`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for CampaignPlanningPointEstimate: the required field `max_y` is missing."))
      }
      # check the required field `min_y`
      if (!is.null(input_json$`min_y`)) {
        if (!(is.numeric(input_json$`min_y`) && length(input_json$`min_y`) == 1)) {
          stop(paste("Error! Invalid data for `min_y`. Must be an integer:", input_json$`min_y`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for CampaignPlanningPointEstimate: the required field `min_y` is missing."))
      }
      # check the required field `y`
      if (!is.null(input_json$`y`)) {
        if (!(is.numeric(input_json$`y`) && length(input_json$`y`) == 1)) {
          stop(paste("Error! Invalid data for `y`. Must be an integer:", input_json$`y`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for CampaignPlanningPointEstimate: the required field `y` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of CampaignPlanningPointEstimate
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      # check if the required `budget` is null
      if (is.null(self$`budget`)) {
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
      # check if the required `budget` is null
      if (is.null(self$`budget`)) {
        invalid_fields["budget"] <- "Non-nullable required field `budget` cannot be null."
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
# CampaignPlanningPointEstimate$unlock()
#
## Below is an example to define the print function
# CampaignPlanningPointEstimate$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# CampaignPlanningPointEstimate$lock()

