#' Create a new BoardUpdate
#'
#' @description
#' Board fields for updates
#'
#' @docType class
#' @title BoardUpdate
#' @description BoardUpdate Class
#' @format An \code{R6Class} generator object
#' @field name  character [optional]
#' @field description  character [optional]
#' @field privacy  character [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
BoardUpdate <- R6::R6Class(
  "BoardUpdate",
  public = list(
    `name` = NULL,
    `description` = NULL,
    `privacy` = NULL,
    #' Initialize a new BoardUpdate class.
    #'
    #' @description
    #' Initialize a new BoardUpdate class.
    #'
    #' @param name name
    #' @param description description
    #' @param privacy privacy
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`name` = NULL, `description` = NULL, `privacy` = NULL, ...) {
      if (!is.null(`name`)) {
        if (!(is.character(`name`) && length(`name`) == 1)) {
          stop(paste("Error! Invalid data for `name`. Must be a string:", `name`))
        }
        self$`name` <- `name`
      }
      if (!is.null(`description`)) {
        if (!(is.character(`description`) && length(`description`) == 1)) {
          stop(paste("Error! Invalid data for `description`. Must be a string:", `description`))
        }
        self$`description` <- `description`
      }
      if (!is.null(`privacy`)) {
        if (!(`privacy` %in% c("PUBLIC", "SECRET"))) {
          stop(paste("Error! \"", `privacy`, "\" cannot be assigned to `privacy`. Must be \"PUBLIC\", \"SECRET\".", sep = ""))
        }
        if (!(is.character(`privacy`) && length(`privacy`) == 1)) {
          stop(paste("Error! Invalid data for `privacy`. Must be a string:", `privacy`))
        }
        self$`privacy` <- `privacy`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return BoardUpdate in JSON format
    #' @export
    toJSON = function() {
      BoardUpdateObject <- list()
      if (!is.null(self$`name`)) {
        BoardUpdateObject[["name"]] <-
          self$`name`
      }
      if (!is.null(self$`description`)) {
        BoardUpdateObject[["description"]] <-
          self$`description`
      }
      if (!is.null(self$`privacy`)) {
        BoardUpdateObject[["privacy"]] <-
          self$`privacy`
      }
      BoardUpdateObject
    },
    #' Deserialize JSON string into an instance of BoardUpdate
    #'
    #' @description
    #' Deserialize JSON string into an instance of BoardUpdate
    #'
    #' @param input_json the JSON input
    #' @return the instance of BoardUpdate
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`name`)) {
        self$`name` <- this_object$`name`
      }
      if (!is.null(this_object$`description`)) {
        self$`description` <- this_object$`description`
      }
      if (!is.null(this_object$`privacy`)) {
        if (!is.null(this_object$`privacy`) && !(this_object$`privacy` %in% c("PUBLIC", "SECRET"))) {
          stop(paste("Error! \"", this_object$`privacy`, "\" cannot be assigned to `privacy`. Must be \"PUBLIC\", \"SECRET\".", sep = ""))
        }
        self$`privacy` <- this_object$`privacy`
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return BoardUpdate in JSON format
    #' @export
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`name`)) {
          sprintf(
          '"name":
            "%s"
                    ',
          self$`name`
          )
        },
        if (!is.null(self$`description`)) {
          sprintf(
          '"description":
            "%s"
                    ',
          self$`description`
          )
        },
        if (!is.null(self$`privacy`)) {
          sprintf(
          '"privacy":
            "%s"
                    ',
          self$`privacy`
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of BoardUpdate
    #'
    #' @description
    #' Deserialize JSON string into an instance of BoardUpdate
    #'
    #' @param input_json the JSON input
    #' @return the instance of BoardUpdate
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`name` <- this_object$`name`
      self$`description` <- this_object$`description`
      if (!is.null(this_object$`privacy`) && !(this_object$`privacy` %in% c("PUBLIC", "SECRET"))) {
        stop(paste("Error! \"", this_object$`privacy`, "\" cannot be assigned to `privacy`. Must be \"PUBLIC\", \"SECRET\".", sep = ""))
      }
      self$`privacy` <- this_object$`privacy`
      self
    },
    #' Validate JSON input with respect to BoardUpdate
    #'
    #' @description
    #' Validate JSON input with respect to BoardUpdate and throw an exception if invalid
    #'
    #' @param input the JSON input
    #' @export
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },
    #' To string (JSON format)
    #'
    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of BoardUpdate
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
# BoardUpdate$unlock()
#
## Below is an example to define the print function
# BoardUpdate$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# BoardUpdate$lock()

