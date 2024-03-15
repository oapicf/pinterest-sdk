#' Create a new BoardSection
#'
#' @description
#' Sections help organize pins within a board.
#'
#' @docType class
#' @title BoardSection
#' @description BoardSection Class
#' @format An \code{R6Class} generator object
#' @field id  character [optional]
#' @field name  character
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
BoardSection <- R6::R6Class(
  "BoardSection",
  public = list(
    `id` = NULL,
    `name` = NULL,
    #' Initialize a new BoardSection class.
    #'
    #' @description
    #' Initialize a new BoardSection class.
    #'
    #' @param name name
    #' @param id id
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`name`, `id` = NULL, ...) {
      if (!missing(`name`)) {
        if (!(is.character(`name`) && length(`name`) == 1)) {
          stop(paste("Error! Invalid data for `name`. Must be a string:", `name`))
        }
        self$`name` <- `name`
      }
      if (!is.null(`id`)) {
        if (!(is.character(`id`) && length(`id`) == 1)) {
          stop(paste("Error! Invalid data for `id`. Must be a string:", `id`))
        }
        self$`id` <- `id`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return BoardSection in JSON format
    #' @export
    toJSON = function() {
      BoardSectionObject <- list()
      if (!is.null(self$`id`)) {
        BoardSectionObject[["id"]] <-
          self$`id`
      }
      if (!is.null(self$`name`)) {
        BoardSectionObject[["name"]] <-
          self$`name`
      }
      BoardSectionObject
    },
    #' Deserialize JSON string into an instance of BoardSection
    #'
    #' @description
    #' Deserialize JSON string into an instance of BoardSection
    #'
    #' @param input_json the JSON input
    #' @return the instance of BoardSection
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`id`)) {
        self$`id` <- this_object$`id`
      }
      if (!is.null(this_object$`name`)) {
        self$`name` <- this_object$`name`
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return BoardSection in JSON format
    #' @export
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
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of BoardSection
    #'
    #' @description
    #' Deserialize JSON string into an instance of BoardSection
    #'
    #' @param input_json the JSON input
    #' @return the instance of BoardSection
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`id` <- this_object$`id`
      self$`name` <- this_object$`name`
      self
    },
    #' Validate JSON input with respect to BoardSection
    #'
    #' @description
    #' Validate JSON input with respect to BoardSection and throw an exception if invalid
    #'
    #' @param input the JSON input
    #' @export
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `name`
      if (!is.null(input_json$`name`)) {
        if (!(is.character(input_json$`name`) && length(input_json$`name`) == 1)) {
          stop(paste("Error! Invalid data for `name`. Must be a string:", input_json$`name`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for BoardSection: the required field `name` is missing."))
      }
    },
    #' To string (JSON format)
    #'
    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of BoardSection
    #' @export
    toString = function() {
      self$toJSONString()
    },
    #' Return true if the values in all fields are valid.
    #'
    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    #' @export
    isValid = function() {
      # check if the required `name` is null
      if (is.null(self$`name`)) {
        return(FALSE)
      }

      if (nchar(self$`name`) > 180) {
        return(FALSE)
      }
      if (nchar(self$`name`) < 1) {
        return(FALSE)
      }

      TRUE
    },
    #' Return a list of invalid fields (if any).
    #'
    #' @description
    #' Return a list of invalid fields (if any).
    #'
    #' @return A list of invalid fields (if any).
    #' @export
    getInvalidFields = function() {
      invalid_fields <- list()
      # check if the required `name` is null
      if (is.null(self$`name`)) {
        invalid_fields["name"] <- "Non-nullable required field `name` cannot be null."
      }

      if (nchar(self$`name`) > 180) {
        invalid_fields["name"] <- "Invalid length for `name`, must be smaller than or equal to 180."
      }
      if (nchar(self$`name`) < 1) {
        invalid_fields["name"] <- "Invalid length for `name`, must be bigger than or equal to 1."
      }

      invalid_fields
    },
    #' Print the object
    #'
    #' @description
    #' Print the object
    #'
    #' @export
    print = function() {
      print(jsonlite::prettify(self$toJSONString()))
      invisible(self)
    }
  ),
  # Lock the class to prevent modifications to the method or field
  lock_class = TRUE
)
## Uncomment below to unlock the class to allow modifications of the method or field
# BoardSection$unlock()
#
## Below is an example to define the print function
# BoardSection$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# BoardSection$lock()

