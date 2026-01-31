#' Create a new SingleInterestTargetingOptionResponse
#'
#' @description
#' SingleInterestTargetingOptionResponse Class
#'
#' @docType class
#' @title SingleInterestTargetingOptionResponse
#' @description SingleInterestTargetingOptionResponse Class
#' @format An \code{R6Class} generator object
#' @field child_interests  list(character) [optional]
#' @field id  character [optional]
#' @field level  integer [optional]
#' @field name  character [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
SingleInterestTargetingOptionResponse <- R6::R6Class(
  "SingleInterestTargetingOptionResponse",
  public = list(
    `child_interests` = NULL,
    `id` = NULL,
    `level` = NULL,
    `name` = NULL,

    #' @description
    #' Initialize a new SingleInterestTargetingOptionResponse class.
    #'
    #' @param child_interests child_interests
    #' @param id id
    #' @param level level
    #' @param name name
    #' @param ... Other optional arguments.
    initialize = function(`child_interests` = NULL, `id` = NULL, `level` = NULL, `name` = NULL, ...) {
      if (!is.null(`child_interests`)) {
        stopifnot(is.vector(`child_interests`), length(`child_interests`) != 0)
        sapply(`child_interests`, function(x) stopifnot(is.character(x)))
        self$`child_interests` <- `child_interests`
      }
      if (!is.null(`id`)) {
        if (!(is.character(`id`) && length(`id`) == 1)) {
          stop(paste("Error! Invalid data for `id`. Must be a string:", `id`))
        }
        self$`id` <- `id`
      }
      if (!is.null(`level`)) {
        if (!(is.numeric(`level`) && length(`level`) == 1)) {
          stop(paste("Error! Invalid data for `level`. Must be an integer:", `level`))
        }
        self$`level` <- `level`
      }
      if (!is.null(`name`)) {
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
    #' @return SingleInterestTargetingOptionResponse as a base R list.
    #' @examples
    #' # convert array of SingleInterestTargetingOptionResponse (x) to a data frame
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
    #' Convert SingleInterestTargetingOptionResponse to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      SingleInterestTargetingOptionResponseObject <- list()
      if (!is.null(self$`child_interests`)) {
        SingleInterestTargetingOptionResponseObject[["child_interests"]] <-
          self$`child_interests`
      }
      if (!is.null(self$`id`)) {
        SingleInterestTargetingOptionResponseObject[["id"]] <-
          self$`id`
      }
      if (!is.null(self$`level`)) {
        SingleInterestTargetingOptionResponseObject[["level"]] <-
          self$`level`
      }
      if (!is.null(self$`name`)) {
        SingleInterestTargetingOptionResponseObject[["name"]] <-
          self$`name`
      }
      return(SingleInterestTargetingOptionResponseObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of SingleInterestTargetingOptionResponse
    #'
    #' @param input_json the JSON input
    #' @return the instance of SingleInterestTargetingOptionResponse
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
    #' @return SingleInterestTargetingOptionResponse in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of SingleInterestTargetingOptionResponse
    #'
    #' @param input_json the JSON input
    #' @return the instance of SingleInterestTargetingOptionResponse
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`child_interests` <- ApiClient$new()$deserializeObj(this_object$`child_interests`, "array[character]", loadNamespace("openapi"))
      self$`id` <- this_object$`id`
      self$`level` <- this_object$`level`
      self$`name` <- this_object$`name`
      self
    },

    #' @description
    #' Validate JSON input with respect to SingleInterestTargetingOptionResponse and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of SingleInterestTargetingOptionResponse
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      if (!str_detect(self$`id`, "\\d+")) {
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
      if (!str_detect(self$`id`, "\\d+")) {
        invalid_fields["id"] <- "Invalid value for `id`, must conform to the pattern \\d+."
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
# SingleInterestTargetingOptionResponse$unlock()
#
## Below is an example to define the print function
# SingleInterestTargetingOptionResponse$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# SingleInterestTargetingOptionResponse$lock()

