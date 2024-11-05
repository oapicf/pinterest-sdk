#' Create a new SingleInterestTargetingOptionResponse
#'
#' @description
#' SingleInterestTargetingOptionResponse Class
#'
#' @docType class
#' @title SingleInterestTargetingOptionResponse
#' @description SingleInterestTargetingOptionResponse Class
#' @format An \code{R6Class} generator object
#' @field id  character [optional]
#' @field name  character [optional]
#' @field child_interests  list(character) [optional]
#' @field level  integer [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
SingleInterestTargetingOptionResponse <- R6::R6Class(
  "SingleInterestTargetingOptionResponse",
  public = list(
    `id` = NULL,
    `name` = NULL,
    `child_interests` = NULL,
    `level` = NULL,

    #' @description
    #' Initialize a new SingleInterestTargetingOptionResponse class.
    #'
    #' @param id id
    #' @param name name
    #' @param child_interests child_interests
    #' @param level level
    #' @param ... Other optional arguments.
    initialize = function(`id` = NULL, `name` = NULL, `child_interests` = NULL, `level` = NULL, ...) {
      if (!is.null(`id`)) {
        if (!(is.character(`id`) && length(`id`) == 1)) {
          stop(paste("Error! Invalid data for `id`. Must be a string:", `id`))
        }
        self$`id` <- `id`
      }
      if (!is.null(`name`)) {
        if (!(is.character(`name`) && length(`name`) == 1)) {
          stop(paste("Error! Invalid data for `name`. Must be a string:", `name`))
        }
        self$`name` <- `name`
      }
      if (!is.null(`child_interests`)) {
        stopifnot(is.vector(`child_interests`), length(`child_interests`) != 0)
        sapply(`child_interests`, function(x) stopifnot(is.character(x)))
        self$`child_interests` <- `child_interests`
      }
      if (!is.null(`level`)) {
        if (!(is.numeric(`level`) && length(`level`) == 1)) {
          stop(paste("Error! Invalid data for `level`. Must be an integer:", `level`))
        }
        self$`level` <- `level`
      }
    },

    #' @description
    #' To JSON String
    #'
    #' @return SingleInterestTargetingOptionResponse in JSON format
    toJSON = function() {
      SingleInterestTargetingOptionResponseObject <- list()
      if (!is.null(self$`id`)) {
        SingleInterestTargetingOptionResponseObject[["id"]] <-
          self$`id`
      }
      if (!is.null(self$`name`)) {
        SingleInterestTargetingOptionResponseObject[["name"]] <-
          self$`name`
      }
      if (!is.null(self$`child_interests`)) {
        SingleInterestTargetingOptionResponseObject[["child_interests"]] <-
          self$`child_interests`
      }
      if (!is.null(self$`level`)) {
        SingleInterestTargetingOptionResponseObject[["level"]] <-
          self$`level`
      }
      SingleInterestTargetingOptionResponseObject
    },

    #' @description
    #' Deserialize JSON string into an instance of SingleInterestTargetingOptionResponse
    #'
    #' @param input_json the JSON input
    #' @return the instance of SingleInterestTargetingOptionResponse
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`id`)) {
        self$`id` <- this_object$`id`
      }
      if (!is.null(this_object$`name`)) {
        self$`name` <- this_object$`name`
      }
      if (!is.null(this_object$`child_interests`)) {
        self$`child_interests` <- ApiClient$new()$deserializeObj(this_object$`child_interests`, "array[character]", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`level`)) {
        self$`level` <- this_object$`level`
      }
      self
    },

    #' @description
    #' To JSON String
    #'
    #' @return SingleInterestTargetingOptionResponse in JSON format
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`id`)) {
          sprintf(
          '"id":
            "%s"
                    ',
          self$`id`
          )
        },
        if (!is.null(self$`name`)) {
          sprintf(
          '"name":
            "%s"
                    ',
          self$`name`
          )
        },
        if (!is.null(self$`child_interests`)) {
          sprintf(
          '"child_interests":
             [%s]
          ',
          paste(unlist(lapply(self$`child_interests`, function(x) paste0('"', x, '"'))), collapse = ",")
          )
        },
        if (!is.null(self$`level`)) {
          sprintf(
          '"level":
            %d
                    ',
          self$`level`
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },

    #' @description
    #' Deserialize JSON string into an instance of SingleInterestTargetingOptionResponse
    #'
    #' @param input_json the JSON input
    #' @return the instance of SingleInterestTargetingOptionResponse
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`id` <- this_object$`id`
      self$`name` <- this_object$`name`
      self$`child_interests` <- ApiClient$new()$deserializeObj(this_object$`child_interests`, "array[character]", loadNamespace("openapi"))
      self$`level` <- this_object$`level`
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

