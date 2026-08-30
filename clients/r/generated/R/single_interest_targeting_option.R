#' Create a new SingleInterestTargetingOption
#'
#' @description
#' SingleInterestTargetingOption Class
#'
#' @docType class
#' @title SingleInterestTargetingOption
#' @description SingleInterestTargetingOption Class
#' @format An \code{R6Class} generator object
#' @field child_interests  list(character)
#' @field id  character
#' @field level  integer
#' @field name  character
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
SingleInterestTargetingOption <- R6::R6Class(
  "SingleInterestTargetingOption",
  public = list(
    `child_interests` = NULL,
    `id` = NULL,
    `level` = NULL,
    `name` = NULL,

    #' @description
    #' Initialize a new SingleInterestTargetingOption class.
    #'
    #' @param child_interests child_interests
    #' @param id id
    #' @param level level
    #' @param name name
    #' @param ... Other optional arguments.
    initialize = function(`child_interests`, `id`, `level`, `name`, ...) {
      if (!missing(`child_interests`)) {
        stopifnot(is.vector(`child_interests`), length(`child_interests`) != 0)
        sapply(`child_interests`, function(x) stopifnot(is.character(x)))
        self$`child_interests` <- `child_interests`
      }
      if (!missing(`id`)) {
        if (!(is.character(`id`) && length(`id`) == 1)) {
          stop(paste("Error! Invalid data for `id`. Must be a string:", `id`))
        }
        self$`id` <- `id`
      }
      if (!missing(`level`)) {
        if (!(is.numeric(`level`) && length(`level`) == 1)) {
          stop(paste("Error! Invalid data for `level`. Must be an integer:", `level`))
        }
        self$`level` <- `level`
      }
      if (!missing(`name`)) {
        if (!(is.character(`name`) && length(`name`) == 1)) {
          stop(paste("Error! Invalid data for `name`. Must be a string:", `name`))
        }
        self$`name` <- `name`
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
    #' @return SingleInterestTargetingOption as a base R list.
    #' @examples
    #' # convert array of SingleInterestTargetingOption (x) to a data frame
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
    #' Convert SingleInterestTargetingOption to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      SingleInterestTargetingOptionObject <- list()
      if (!is.null(self$`child_interests`)) {
        SingleInterestTargetingOptionObject[["child_interests"]] <-
          self$`child_interests`
      }
      if (!is.null(self$`id`)) {
        SingleInterestTargetingOptionObject[["id"]] <-
          self$`id`
      }
      if (!is.null(self$`level`)) {
        SingleInterestTargetingOptionObject[["level"]] <-
          self$`level`
      }
      if (!is.null(self$`name`)) {
        SingleInterestTargetingOptionObject[["name"]] <-
          self$`name`
      }
      return(SingleInterestTargetingOptionObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of SingleInterestTargetingOption
    #'
    #' @param input_json the JSON input
    #' @return the instance of SingleInterestTargetingOption
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`child_interests`)) {
        self$`child_interests` <- ApiClient$new()$deserializeObj(this_object$`child_interests`, "array[character]", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`id`)) {
        self$`id` <- this_object$`id`
      }
      if (!is.null(this_object$`level`)) {
        self$`level` <- this_object$`level`
      }
      if (!is.null(this_object$`name`)) {
        self$`name` <- this_object$`name`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return SingleInterestTargetingOption in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of SingleInterestTargetingOption
    #'
    #' @param input_json the JSON input
    #' @return the instance of SingleInterestTargetingOption
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`child_interests` <- ApiClient$new()$deserializeObj(this_object$`child_interests`, "array[character]", loadNamespace("openapi"))
      self$`id` <- this_object$`id`
      self$`level` <- this_object$`level`
      self$`name` <- this_object$`name`
      self
    },

    #' @description
    #' Validate JSON input with respect to SingleInterestTargetingOption and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `child_interests`
      if (!is.null(input_json$`child_interests`)) {
        stopifnot(is.vector(input_json$`child_interests`), length(input_json$`child_interests`) != 0)
        tmp <- sapply(input_json$`child_interests`, function(x) stopifnot(is.character(x)))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for SingleInterestTargetingOption: the required field `child_interests` is missing."))
      }
      # check the required field `id`
      if (!is.null(input_json$`id`)) {
        if (!(is.character(input_json$`id`) && length(input_json$`id`) == 1)) {
          stop(paste("Error! Invalid data for `id`. Must be a string:", input_json$`id`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for SingleInterestTargetingOption: the required field `id` is missing."))
      }
      # check the required field `level`
      if (!is.null(input_json$`level`)) {
        if (!(is.numeric(input_json$`level`) && length(input_json$`level`) == 1)) {
          stop(paste("Error! Invalid data for `level`. Must be an integer:", input_json$`level`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for SingleInterestTargetingOption: the required field `level` is missing."))
      }
      # check the required field `name`
      if (!is.null(input_json$`name`)) {
        if (!(is.character(input_json$`name`) && length(input_json$`name`) == 1)) {
          stop(paste("Error! Invalid data for `name`. Must be a string:", input_json$`name`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for SingleInterestTargetingOption: the required field `name` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of SingleInterestTargetingOption
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      # check if the required `child_interests` is null
      if (is.null(self$`child_interests`)) {
        return(FALSE)
      }

      # check if the required `id` is null
      if (is.null(self$`id`)) {
        return(FALSE)
      }

      if (!str_detect(self$`id`, "^\\d+$")) {
        return(FALSE)
      }

      # check if the required `level` is null
      if (is.null(self$`level`)) {
        return(FALSE)
      }

      # check if the required `name` is null
      if (is.null(self$`name`)) {
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
      # check if the required `child_interests` is null
      if (is.null(self$`child_interests`)) {
        invalid_fields["child_interests"] <- "Non-nullable required field `child_interests` cannot be null."
      }

      # check if the required `id` is null
      if (is.null(self$`id`)) {
        invalid_fields["id"] <- "Non-nullable required field `id` cannot be null."
      }

      if (!str_detect(self$`id`, "^\\d+$")) {
        invalid_fields["id"] <- "Invalid value for `id`, must conform to the pattern ^\\d+$."
      }

      # check if the required `level` is null
      if (is.null(self$`level`)) {
        invalid_fields["level"] <- "Non-nullable required field `level` cannot be null."
      }

      # check if the required `name` is null
      if (is.null(self$`name`)) {
        invalid_fields["name"] <- "Non-nullable required field `name` cannot be null."
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
# SingleInterestTargetingOption$unlock()
#
## Below is an example to define the print function
# SingleInterestTargetingOption$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# SingleInterestTargetingOption$lock()

