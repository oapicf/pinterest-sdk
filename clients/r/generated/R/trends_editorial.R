#' Create a new TrendsEditorial
#'
#' @description
#' Information of the published editorial article.
#'
#' @docType class
#' @title TrendsEditorial
#' @description TrendsEditorial Class
#' @format An \code{R6Class} generator object
#' @field board_url URL of the editorial board character
#' @field description Description of the editorial article character
#' @field interests List of interests related to the editorial article list(character)
#' @field pins_url URL of the pins related to the editorial article list(character)
#' @field related_keywords List of keywords related to the editorial article list(\link{KeywordInfo})
#' @field title Title of the editorial article character
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
TrendsEditorial <- R6::R6Class(
  "TrendsEditorial",
  public = list(
    `board_url` = NULL,
    `description` = NULL,
    `interests` = NULL,
    `pins_url` = NULL,
    `related_keywords` = NULL,
    `title` = NULL,

    #' @description
    #' Initialize a new TrendsEditorial class.
    #'
    #' @param board_url URL of the editorial board
    #' @param description Description of the editorial article
    #' @param interests List of interests related to the editorial article
    #' @param pins_url URL of the pins related to the editorial article
    #' @param related_keywords List of keywords related to the editorial article
    #' @param title Title of the editorial article
    #' @param ... Other optional arguments.
    initialize = function(`board_url`, `description`, `interests`, `pins_url`, `related_keywords`, `title`, ...) {
      if (!missing(`board_url`)) {
        if (!(is.character(`board_url`) && length(`board_url`) == 1)) {
          stop(paste("Error! Invalid data for `board_url`. Must be a string:", `board_url`))
        }
        self$`board_url` <- `board_url`
      }
      if (!missing(`description`)) {
        if (!(is.character(`description`) && length(`description`) == 1)) {
          stop(paste("Error! Invalid data for `description`. Must be a string:", `description`))
        }
        self$`description` <- `description`
      }
      if (!missing(`interests`)) {
        stopifnot(is.vector(`interests`), length(`interests`) != 0)
        sapply(`interests`, function(x) stopifnot(is.character(x)))
        self$`interests` <- `interests`
      }
      if (!missing(`pins_url`)) {
        stopifnot(is.vector(`pins_url`), length(`pins_url`) != 0)
        sapply(`pins_url`, function(x) stopifnot(is.character(x)))
        self$`pins_url` <- `pins_url`
      }
      if (!missing(`related_keywords`)) {
        stopifnot(is.vector(`related_keywords`), length(`related_keywords`) != 0)
        sapply(`related_keywords`, function(x) stopifnot(R6::is.R6(x)))
        self$`related_keywords` <- `related_keywords`
      }
      if (!missing(`title`)) {
        if (!(is.character(`title`) && length(`title`) == 1)) {
          stop(paste("Error! Invalid data for `title`. Must be a string:", `title`))
        }
        self$`title` <- `title`
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
    #' @return TrendsEditorial as a base R list.
    #' @examples
    #' # convert array of TrendsEditorial (x) to a data frame
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
    #' Convert TrendsEditorial to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      TrendsEditorialObject <- list()
      if (!is.null(self$`board_url`)) {
        TrendsEditorialObject[["board_url"]] <-
          self$`board_url`
      }
      if (!is.null(self$`description`)) {
        TrendsEditorialObject[["description"]] <-
          self$`description`
      }
      if (!is.null(self$`interests`)) {
        TrendsEditorialObject[["interests"]] <-
          self$`interests`
      }
      if (!is.null(self$`pins_url`)) {
        TrendsEditorialObject[["pins_url"]] <-
          self$`pins_url`
      }
      if (!is.null(self$`related_keywords`)) {
        TrendsEditorialObject[["related_keywords"]] <-
          self$extractSimpleType(self$`related_keywords`)
      }
      if (!is.null(self$`title`)) {
        TrendsEditorialObject[["title"]] <-
          self$`title`
      }
      return(TrendsEditorialObject)
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
    #' Deserialize JSON string into an instance of TrendsEditorial
    #'
    #' @param input_json the JSON input
    #' @return the instance of TrendsEditorial
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`board_url`)) {
        self$`board_url` <- this_object$`board_url`
      }
      if (!is.null(this_object$`description`)) {
        self$`description` <- this_object$`description`
      }
      if (!is.null(this_object$`interests`)) {
        self$`interests` <- ApiClient$new()$deserializeObj(this_object$`interests`, "array[character]", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`pins_url`)) {
        self$`pins_url` <- ApiClient$new()$deserializeObj(this_object$`pins_url`, "array[character]", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`related_keywords`)) {
        self$`related_keywords` <- ApiClient$new()$deserializeObj(this_object$`related_keywords`, "array[KeywordInfo]", loadNamespace("openapi"))
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
    #' @return TrendsEditorial in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of TrendsEditorial
    #'
    #' @param input_json the JSON input
    #' @return the instance of TrendsEditorial
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`board_url` <- this_object$`board_url`
      self$`description` <- this_object$`description`
      self$`interests` <- ApiClient$new()$deserializeObj(this_object$`interests`, "array[character]", loadNamespace("openapi"))
      self$`pins_url` <- ApiClient$new()$deserializeObj(this_object$`pins_url`, "array[character]", loadNamespace("openapi"))
      self$`related_keywords` <- ApiClient$new()$deserializeObj(this_object$`related_keywords`, "array[KeywordInfo]", loadNamespace("openapi"))
      self$`title` <- this_object$`title`
      self
    },

    #' @description
    #' Validate JSON input with respect to TrendsEditorial and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `board_url`
      if (!is.null(input_json$`board_url`)) {
        if (!(is.character(input_json$`board_url`) && length(input_json$`board_url`) == 1)) {
          stop(paste("Error! Invalid data for `board_url`. Must be a string:", input_json$`board_url`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for TrendsEditorial: the required field `board_url` is missing."))
      }
      # check the required field `description`
      if (!is.null(input_json$`description`)) {
        if (!(is.character(input_json$`description`) && length(input_json$`description`) == 1)) {
          stop(paste("Error! Invalid data for `description`. Must be a string:", input_json$`description`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for TrendsEditorial: the required field `description` is missing."))
      }
      # check the required field `interests`
      if (!is.null(input_json$`interests`)) {
        stopifnot(is.vector(input_json$`interests`), length(input_json$`interests`) != 0)
        tmp <- sapply(input_json$`interests`, function(x) stopifnot(is.character(x)))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for TrendsEditorial: the required field `interests` is missing."))
      }
      # check the required field `pins_url`
      if (!is.null(input_json$`pins_url`)) {
        stopifnot(is.vector(input_json$`pins_url`), length(input_json$`pins_url`) != 0)
        tmp <- sapply(input_json$`pins_url`, function(x) stopifnot(is.character(x)))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for TrendsEditorial: the required field `pins_url` is missing."))
      }
      # check the required field `related_keywords`
      if (!is.null(input_json$`related_keywords`)) {
        stopifnot(is.vector(input_json$`related_keywords`), length(input_json$`related_keywords`) != 0)
        tmp <- sapply(input_json$`related_keywords`, function(x) stopifnot(R6::is.R6(x)))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for TrendsEditorial: the required field `related_keywords` is missing."))
      }
      # check the required field `title`
      if (!is.null(input_json$`title`)) {
        if (!(is.character(input_json$`title`) && length(input_json$`title`) == 1)) {
          stop(paste("Error! Invalid data for `title`. Must be a string:", input_json$`title`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for TrendsEditorial: the required field `title` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of TrendsEditorial
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      # check if the required `board_url` is null
      if (is.null(self$`board_url`)) {
        return(FALSE)
      }

      # check if the required `description` is null
      if (is.null(self$`description`)) {
        return(FALSE)
      }

      # check if the required `interests` is null
      if (is.null(self$`interests`)) {
        return(FALSE)
      }

      # check if the required `pins_url` is null
      if (is.null(self$`pins_url`)) {
        return(FALSE)
      }

      # check if the required `related_keywords` is null
      if (is.null(self$`related_keywords`)) {
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
      # check if the required `board_url` is null
      if (is.null(self$`board_url`)) {
        invalid_fields["board_url"] <- "Non-nullable required field `board_url` cannot be null."
      }

      # check if the required `description` is null
      if (is.null(self$`description`)) {
        invalid_fields["description"] <- "Non-nullable required field `description` cannot be null."
      }

      # check if the required `interests` is null
      if (is.null(self$`interests`)) {
        invalid_fields["interests"] <- "Non-nullable required field `interests` cannot be null."
      }

      # check if the required `pins_url` is null
      if (is.null(self$`pins_url`)) {
        invalid_fields["pins_url"] <- "Non-nullable required field `pins_url` cannot be null."
      }

      # check if the required `related_keywords` is null
      if (is.null(self$`related_keywords`)) {
        invalid_fields["related_keywords"] <- "Non-nullable required field `related_keywords` cannot be null."
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
# TrendsEditorial$unlock()
#
## Below is an example to define the print function
# TrendsEditorial$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# TrendsEditorial$lock()

