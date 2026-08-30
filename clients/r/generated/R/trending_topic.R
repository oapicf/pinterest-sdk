#' Create a new TrendingTopic
#'
#' @description
#' Individual trending topic within an interest category
#'
#' @docType class
#' @title TrendingTopic
#' @description TrendingTopic Class
#' @format An \code{R6Class} generator object
#' @field description Description of the trending topic character
#' @field id Unique identifier for the trending topic character
#' @field percent_growth_mom Month-over-month growth percentage integer [optional]
#' @field pins Array of pin images related to this trend (up to 6) list(\link{TrendingPin})
#' @field related_interests List of related interest categories list(character)
#' @field related_searches List of related search terms list(character)
#' @field time_series Time series data showing trend values over time, with dates as keys and values as numeric named list(numeric)
#' @field title Title of the trending topic character
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
TrendingTopic <- R6::R6Class(
  "TrendingTopic",
  public = list(
    `description` = NULL,
    `id` = NULL,
    `percent_growth_mom` = NULL,
    `pins` = NULL,
    `related_interests` = NULL,
    `related_searches` = NULL,
    `time_series` = NULL,
    `title` = NULL,

    #' @description
    #' Initialize a new TrendingTopic class.
    #'
    #' @param description Description of the trending topic
    #' @param id Unique identifier for the trending topic
    #' @param pins Array of pin images related to this trend (up to 6)
    #' @param related_interests List of related interest categories
    #' @param related_searches List of related search terms
    #' @param time_series Time series data showing trend values over time, with dates as keys and values as numeric
    #' @param title Title of the trending topic
    #' @param percent_growth_mom Month-over-month growth percentage
    #' @param ... Other optional arguments.
    initialize = function(`description`, `id`, `pins`, `related_interests`, `related_searches`, `time_series`, `title`, `percent_growth_mom` = NULL, ...) {
      if (!missing(`description`)) {
        if (!(is.character(`description`) && length(`description`) == 1)) {
          stop(paste("Error! Invalid data for `description`. Must be a string:", `description`))
        }
        self$`description` <- `description`
      }
      if (!missing(`id`)) {
        if (!(is.character(`id`) && length(`id`) == 1)) {
          stop(paste("Error! Invalid data for `id`. Must be a string:", `id`))
        }
        self$`id` <- `id`
      }
      if (!missing(`pins`)) {
        stopifnot(is.vector(`pins`), length(`pins`) != 0)
        sapply(`pins`, function(x) stopifnot(R6::is.R6(x)))
        self$`pins` <- `pins`
      }
      if (!missing(`related_interests`)) {
        stopifnot(is.vector(`related_interests`), length(`related_interests`) != 0)
        sapply(`related_interests`, function(x) stopifnot(is.character(x)))
        self$`related_interests` <- `related_interests`
      }
      if (!missing(`related_searches`)) {
        stopifnot(is.vector(`related_searches`), length(`related_searches`) != 0)
        sapply(`related_searches`, function(x) stopifnot(is.character(x)))
        self$`related_searches` <- `related_searches`
      }
      if (!missing(`time_series`)) {
        stopifnot(is.vector(`time_series`), length(`time_series`) != 0)
        sapply(`time_series`, function(x) stopifnot(is.character(x)))
        self$`time_series` <- `time_series`
      }
      if (!missing(`title`)) {
        if (!(is.character(`title`) && length(`title`) == 1)) {
          stop(paste("Error! Invalid data for `title`. Must be a string:", `title`))
        }
        self$`title` <- `title`
      }
      if (!is.null(`percent_growth_mom`)) {
        if (!(is.numeric(`percent_growth_mom`) && length(`percent_growth_mom`) == 1)) {
          stop(paste("Error! Invalid data for `percent_growth_mom`. Must be an integer:", `percent_growth_mom`))
        }
        self$`percent_growth_mom` <- `percent_growth_mom`
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
    #' @return TrendingTopic as a base R list.
    #' @examples
    #' # convert array of TrendingTopic (x) to a data frame
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
    #' Convert TrendingTopic to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      TrendingTopicObject <- list()
      if (!is.null(self$`description`)) {
        TrendingTopicObject[["description"]] <-
          self$`description`
      }
      if (!is.null(self$`id`)) {
        TrendingTopicObject[["id"]] <-
          self$`id`
      }
      if (!is.null(self$`percent_growth_mom`)) {
        TrendingTopicObject[["percent_growth_mom"]] <-
          self$`percent_growth_mom`
      }
      if (!is.null(self$`pins`)) {
        TrendingTopicObject[["pins"]] <-
          self$extractSimpleType(self$`pins`)
      }
      if (!is.null(self$`related_interests`)) {
        TrendingTopicObject[["related_interests"]] <-
          self$`related_interests`
      }
      if (!is.null(self$`related_searches`)) {
        TrendingTopicObject[["related_searches"]] <-
          self$`related_searches`
      }
      if (!is.null(self$`time_series`)) {
        TrendingTopicObject[["time_series"]] <-
          self$`time_series`
      }
      if (!is.null(self$`title`)) {
        TrendingTopicObject[["title"]] <-
          self$`title`
      }
      return(TrendingTopicObject)
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
    #' Deserialize JSON string into an instance of TrendingTopic
    #'
    #' @param input_json the JSON input
    #' @return the instance of TrendingTopic
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`description`)) {
        self$`description` <- this_object$`description`
      }
      if (!is.null(this_object$`id`)) {
        self$`id` <- this_object$`id`
      }
      if (!is.null(this_object$`percent_growth_mom`)) {
        self$`percent_growth_mom` <- this_object$`percent_growth_mom`
      }
      if (!is.null(this_object$`pins`)) {
        self$`pins` <- ApiClient$new()$deserializeObj(this_object$`pins`, "array[TrendingPin]", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`related_interests`)) {
        self$`related_interests` <- ApiClient$new()$deserializeObj(this_object$`related_interests`, "array[character]", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`related_searches`)) {
        self$`related_searches` <- ApiClient$new()$deserializeObj(this_object$`related_searches`, "array[character]", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`time_series`)) {
        self$`time_series` <- ApiClient$new()$deserializeObj(this_object$`time_series`, "map(numeric)", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`title`)) {
        self$`title` <- this_object$`title`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return TrendingTopic in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of TrendingTopic
    #'
    #' @param input_json the JSON input
    #' @return the instance of TrendingTopic
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`description` <- this_object$`description`
      self$`id` <- this_object$`id`
      self$`percent_growth_mom` <- this_object$`percent_growth_mom`
      self$`pins` <- ApiClient$new()$deserializeObj(this_object$`pins`, "array[TrendingPin]", loadNamespace("openapi"))
      self$`related_interests` <- ApiClient$new()$deserializeObj(this_object$`related_interests`, "array[character]", loadNamespace("openapi"))
      self$`related_searches` <- ApiClient$new()$deserializeObj(this_object$`related_searches`, "array[character]", loadNamespace("openapi"))
      self$`time_series` <- ApiClient$new()$deserializeObj(this_object$`time_series`, "map(numeric)", loadNamespace("openapi"))
      self$`title` <- this_object$`title`
      self
    },

    #' @description
    #' Validate JSON input with respect to TrendingTopic and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `description`
      if (!is.null(input_json$`description`)) {
        if (!(is.character(input_json$`description`) && length(input_json$`description`) == 1)) {
          stop(paste("Error! Invalid data for `description`. Must be a string:", input_json$`description`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for TrendingTopic: the required field `description` is missing."))
      }
      # check the required field `id`
      if (!is.null(input_json$`id`)) {
        if (!(is.character(input_json$`id`) && length(input_json$`id`) == 1)) {
          stop(paste("Error! Invalid data for `id`. Must be a string:", input_json$`id`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for TrendingTopic: the required field `id` is missing."))
      }
      # check the required field `pins`
      if (!is.null(input_json$`pins`)) {
        stopifnot(is.vector(input_json$`pins`), length(input_json$`pins`) != 0)
        tmp <- sapply(input_json$`pins`, function(x) stopifnot(R6::is.R6(x)))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for TrendingTopic: the required field `pins` is missing."))
      }
      # check the required field `related_interests`
      if (!is.null(input_json$`related_interests`)) {
        stopifnot(is.vector(input_json$`related_interests`), length(input_json$`related_interests`) != 0)
        tmp <- sapply(input_json$`related_interests`, function(x) stopifnot(is.character(x)))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for TrendingTopic: the required field `related_interests` is missing."))
      }
      # check the required field `related_searches`
      if (!is.null(input_json$`related_searches`)) {
        stopifnot(is.vector(input_json$`related_searches`), length(input_json$`related_searches`) != 0)
        tmp <- sapply(input_json$`related_searches`, function(x) stopifnot(is.character(x)))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for TrendingTopic: the required field `related_searches` is missing."))
      }
      # check the required field `time_series`
      if (!is.null(input_json$`time_series`)) {
        stopifnot(is.vector(input_json$`time_series`), length(input_json$`time_series`) != 0)
        tmp <- sapply(input_json$`time_series`, function(x) stopifnot(is.character(x)))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for TrendingTopic: the required field `time_series` is missing."))
      }
      # check the required field `title`
      if (!is.null(input_json$`title`)) {
        if (!(is.character(input_json$`title`) && length(input_json$`title`) == 1)) {
          stop(paste("Error! Invalid data for `title`. Must be a string:", input_json$`title`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for TrendingTopic: the required field `title` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of TrendingTopic
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      # check if the required `description` is null
      if (is.null(self$`description`)) {
        return(FALSE)
      }

      # check if the required `id` is null
      if (is.null(self$`id`)) {
        return(FALSE)
      }

      # check if the required `pins` is null
      if (is.null(self$`pins`)) {
        return(FALSE)
      }

      if (length(self$`pins`) > 6) {
        return(FALSE)
      }

      # check if the required `related_interests` is null
      if (is.null(self$`related_interests`)) {
        return(FALSE)
      }

      # check if the required `related_searches` is null
      if (is.null(self$`related_searches`)) {
        return(FALSE)
      }

      # check if the required `time_series` is null
      if (is.null(self$`time_series`)) {
        return(FALSE)
      }

      # check if the required `title` is null
      if (is.null(self$`title`)) {
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
      # check if the required `description` is null
      if (is.null(self$`description`)) {
        invalid_fields["description"] <- "Non-nullable required field `description` cannot be null."
      }

      # check if the required `id` is null
      if (is.null(self$`id`)) {
        invalid_fields["id"] <- "Non-nullable required field `id` cannot be null."
      }

      # check if the required `pins` is null
      if (is.null(self$`pins`)) {
        invalid_fields["pins"] <- "Non-nullable required field `pins` cannot be null."
      }

      if (length(self$`pins`) > 6) {
        invalid_fields["pins"] <- "Invalid length for `pins`, number of items must be less than or equal to 6."
      }

      # check if the required `related_interests` is null
      if (is.null(self$`related_interests`)) {
        invalid_fields["related_interests"] <- "Non-nullable required field `related_interests` cannot be null."
      }

      # check if the required `related_searches` is null
      if (is.null(self$`related_searches`)) {
        invalid_fields["related_searches"] <- "Non-nullable required field `related_searches` cannot be null."
      }

      # check if the required `time_series` is null
      if (is.null(self$`time_series`)) {
        invalid_fields["time_series"] <- "Non-nullable required field `time_series` cannot be null."
      }

      # check if the required `title` is null
      if (is.null(self$`title`)) {
        invalid_fields["title"] <- "Non-nullable required field `title` cannot be null."
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
# TrendingTopic$unlock()
#
## Below is an example to define the print function
# TrendingTopic$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# TrendingTopic$lock()

