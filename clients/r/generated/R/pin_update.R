#' Create a new PinUpdate
#'
#' @description
#' Pin fields for updates
#'
#' @docType class
#' @title PinUpdate
#' @description PinUpdate Class
#' @format An \code{R6Class} generator object
#' @field alt_text Pin's alternative text. character [optional]
#' @field board_id The id of the board to move the Pin onto. character [optional]
#' @field board_section_id <a href=\"https://help.pinterest.com/en/article/create-a-board-section\">Board section</a> ID. character [optional]
#' @field description Pin description - 800 characters maximum. character [optional]
#' @field link URL viewer is taken to when they click pin. character [optional]
#' @field title The native pin title that creators explicitly prefer to display. character [optional]
#' @field carousel_slots Carousel Pin slots data. list(\link{PinUpdateCarouselSlotsInner}) [optional]
#' @field note Private note for this Pin. <a href=\"https://help.pinterest.com/en/article/add-notes-to-your-pins\">Learn more</a>. character [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
PinUpdate <- R6::R6Class(
  "PinUpdate",
  public = list(
    `alt_text` = NULL,
    `board_id` = NULL,
    `board_section_id` = NULL,
    `description` = NULL,
    `link` = NULL,
    `title` = NULL,
    `carousel_slots` = NULL,
    `note` = NULL,
    #' Initialize a new PinUpdate class.
    #'
    #' @description
    #' Initialize a new PinUpdate class.
    #'
    #' @param alt_text Pin's alternative text.
    #' @param board_id The id of the board to move the Pin onto.
    #' @param board_section_id <a href=\"https://help.pinterest.com/en/article/create-a-board-section\">Board section</a> ID.
    #' @param description Pin description - 800 characters maximum.
    #' @param link URL viewer is taken to when they click pin.
    #' @param title The native pin title that creators explicitly prefer to display.
    #' @param carousel_slots Carousel Pin slots data.
    #' @param note Private note for this Pin. <a href=\"https://help.pinterest.com/en/article/add-notes-to-your-pins\">Learn more</a>.
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`alt_text` = NULL, `board_id` = NULL, `board_section_id` = NULL, `description` = NULL, `link` = NULL, `title` = NULL, `carousel_slots` = NULL, `note` = NULL, ...) {
      if (!is.null(`alt_text`)) {
        if (!(is.character(`alt_text`) && length(`alt_text`) == 1)) {
          stop(paste("Error! Invalid data for `alt_text`. Must be a string:", `alt_text`))
        }
        self$`alt_text` <- `alt_text`
      }
      if (!is.null(`board_id`)) {
        if (!(is.character(`board_id`) && length(`board_id`) == 1)) {
          stop(paste("Error! Invalid data for `board_id`. Must be a string:", `board_id`))
        }
        self$`board_id` <- `board_id`
      }
      if (!is.null(`board_section_id`)) {
        if (!(is.character(`board_section_id`) && length(`board_section_id`) == 1)) {
          stop(paste("Error! Invalid data for `board_section_id`. Must be a string:", `board_section_id`))
        }
        self$`board_section_id` <- `board_section_id`
      }
      if (!is.null(`description`)) {
        if (!(is.character(`description`) && length(`description`) == 1)) {
          stop(paste("Error! Invalid data for `description`. Must be a string:", `description`))
        }
        self$`description` <- `description`
      }
      if (!is.null(`link`)) {
        if (!(is.character(`link`) && length(`link`) == 1)) {
          stop(paste("Error! Invalid data for `link`. Must be a string:", `link`))
        }
        self$`link` <- `link`
      }
      if (!is.null(`title`)) {
        if (!(is.character(`title`) && length(`title`) == 1)) {
          stop(paste("Error! Invalid data for `title`. Must be a string:", `title`))
        }
        self$`title` <- `title`
      }
      if (!is.null(`carousel_slots`)) {
        stopifnot(is.vector(`carousel_slots`), length(`carousel_slots`) != 0)
        sapply(`carousel_slots`, function(x) stopifnot(R6::is.R6(x)))
        self$`carousel_slots` <- `carousel_slots`
      }
      if (!is.null(`note`)) {
        if (!(is.character(`note`) && length(`note`) == 1)) {
          stop(paste("Error! Invalid data for `note`. Must be a string:", `note`))
        }
        self$`note` <- `note`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return PinUpdate in JSON format
    #' @export
    toJSON = function() {
      PinUpdateObject <- list()
      if (!is.null(self$`alt_text`)) {
        PinUpdateObject[["alt_text"]] <-
          self$`alt_text`
      }
      if (!is.null(self$`board_id`)) {
        PinUpdateObject[["board_id"]] <-
          self$`board_id`
      }
      if (!is.null(self$`board_section_id`)) {
        PinUpdateObject[["board_section_id"]] <-
          self$`board_section_id`
      }
      if (!is.null(self$`description`)) {
        PinUpdateObject[["description"]] <-
          self$`description`
      }
      if (!is.null(self$`link`)) {
        PinUpdateObject[["link"]] <-
          self$`link`
      }
      if (!is.null(self$`title`)) {
        PinUpdateObject[["title"]] <-
          self$`title`
      }
      if (!is.null(self$`carousel_slots`)) {
        PinUpdateObject[["carousel_slots"]] <-
          lapply(self$`carousel_slots`, function(x) x$toJSON())
      }
      if (!is.null(self$`note`)) {
        PinUpdateObject[["note"]] <-
          self$`note`
      }
      PinUpdateObject
    },
    #' Deserialize JSON string into an instance of PinUpdate
    #'
    #' @description
    #' Deserialize JSON string into an instance of PinUpdate
    #'
    #' @param input_json the JSON input
    #' @return the instance of PinUpdate
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`alt_text`)) {
        self$`alt_text` <- this_object$`alt_text`
      }
      if (!is.null(this_object$`board_id`)) {
        self$`board_id` <- this_object$`board_id`
      }
      if (!is.null(this_object$`board_section_id`)) {
        self$`board_section_id` <- this_object$`board_section_id`
      }
      if (!is.null(this_object$`description`)) {
        self$`description` <- this_object$`description`
      }
      if (!is.null(this_object$`link`)) {
        self$`link` <- this_object$`link`
      }
      if (!is.null(this_object$`title`)) {
        self$`title` <- this_object$`title`
      }
      if (!is.null(this_object$`carousel_slots`)) {
        self$`carousel_slots` <- ApiClient$new()$deserializeObj(this_object$`carousel_slots`, "array[PinUpdateCarouselSlotsInner]", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`note`)) {
        self$`note` <- this_object$`note`
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return PinUpdate in JSON format
    #' @export
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`alt_text`)) {
          sprintf(
          '"alt_text":
            "%s"
                    ',
          self$`alt_text`
          )
        },
        if (!is.null(self$`board_id`)) {
          sprintf(
          '"board_id":
            "%s"
                    ',
          self$`board_id`
          )
        },
        if (!is.null(self$`board_section_id`)) {
          sprintf(
          '"board_section_id":
            "%s"
                    ',
          self$`board_section_id`
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
        if (!is.null(self$`link`)) {
          sprintf(
          '"link":
            "%s"
                    ',
          self$`link`
          )
        },
        if (!is.null(self$`title`)) {
          sprintf(
          '"title":
            "%s"
                    ',
          self$`title`
          )
        },
        if (!is.null(self$`carousel_slots`)) {
          sprintf(
          '"carousel_slots":
          [%s]
',
          paste(sapply(self$`carousel_slots`, function(x) jsonlite::toJSON(x$toJSON(), auto_unbox = TRUE, digits = NA)), collapse = ",")
          )
        },
        if (!is.null(self$`note`)) {
          sprintf(
          '"note":
            "%s"
                    ',
          self$`note`
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of PinUpdate
    #'
    #' @description
    #' Deserialize JSON string into an instance of PinUpdate
    #'
    #' @param input_json the JSON input
    #' @return the instance of PinUpdate
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`alt_text` <- this_object$`alt_text`
      self$`board_id` <- this_object$`board_id`
      self$`board_section_id` <- this_object$`board_section_id`
      self$`description` <- this_object$`description`
      self$`link` <- this_object$`link`
      self$`title` <- this_object$`title`
      self$`carousel_slots` <- ApiClient$new()$deserializeObj(this_object$`carousel_slots`, "array[PinUpdateCarouselSlotsInner]", loadNamespace("openapi"))
      self$`note` <- this_object$`note`
      self
    },
    #' Validate JSON input with respect to PinUpdate
    #'
    #' @description
    #' Validate JSON input with respect to PinUpdate and throw an exception if invalid
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
    #' @return String representation of PinUpdate
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
      if (nchar(self$`alt_text`) > 500) {
        return(FALSE)
      }

      if (!str_detect(self$`board_id`, "^\\d+$")) {
        return(FALSE)
      }

      if (!str_detect(self$`board_section_id`, "^\\d+$")) {
        return(FALSE)
      }

      if (nchar(self$`description`) > 800) {
        return(FALSE)
      }

      if (nchar(self$`link`) > 2048) {
        return(FALSE)
      }

      if (nchar(self$`title`) > 100) {
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
      if (nchar(self$`alt_text`) > 500) {
        invalid_fields["alt_text"] <- "Invalid length for `alt_text`, must be smaller than or equal to 500."
      }

      if (!str_detect(self$`board_id`, "^\\d+$")) {
        invalid_fields["board_id"] <- "Invalid value for `board_id`, must conform to the pattern ^\\d+$."
      }

      if (!str_detect(self$`board_section_id`, "^\\d+$")) {
        invalid_fields["board_section_id"] <- "Invalid value for `board_section_id`, must conform to the pattern ^\\d+$."
      }

      if (nchar(self$`description`) > 800) {
        invalid_fields["description"] <- "Invalid length for `description`, must be smaller than or equal to 800."
      }

      if (nchar(self$`link`) > 2048) {
        invalid_fields["link"] <- "Invalid length for `link`, must be smaller than or equal to 2048."
      }

      if (nchar(self$`title`) > 100) {
        invalid_fields["title"] <- "Invalid length for `title`, must be smaller than or equal to 100."
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
# PinUpdate$unlock()
#
## Below is an example to define the print function
# PinUpdate$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# PinUpdate$lock()

