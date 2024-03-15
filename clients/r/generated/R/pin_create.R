#' Create a new PinCreate
#'
#' @description
#' Pin
#'
#' @docType class
#' @title PinCreate
#' @description PinCreate Class
#' @format An \code{R6Class} generator object
#' @field id  character [optional]
#' @field created_at  character [optional]
#' @field link  character [optional]
#' @field title  character [optional]
#' @field description  character [optional]
#' @field dominant_color Dominant pin color. Hex number, e.g. \\\"#6E7874\\\". character [optional]
#' @field alt_text  character [optional]
#' @field board_id The board to which this Pin belongs. character [optional]
#' @field board_section_id The board section to which this Pin belongs. character [optional]
#' @field board_owner  \link{BoardOwner} [optional]
#' @field media  \link{SummaryPinMedia} [optional]
#' @field media_source  \link{PinMediaSource} [optional]
#' @field parent_pin_id The source pin id if this pin was saved from another pin. <a href=\"https://help.pinterest.com/article/save-pins-on-pinterest\">Learn more</a>. character [optional]
#' @field note Private note for this Pin. <a href=\"https://help.pinterest.com/en/article/add-notes-to-your-pins\">Learn more</a>. character [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
PinCreate <- R6::R6Class(
  "PinCreate",
  public = list(
    `id` = NULL,
    `created_at` = NULL,
    `link` = NULL,
    `title` = NULL,
    `description` = NULL,
    `dominant_color` = NULL,
    `alt_text` = NULL,
    `board_id` = NULL,
    `board_section_id` = NULL,
    `board_owner` = NULL,
    `media` = NULL,
    `media_source` = NULL,
    `parent_pin_id` = NULL,
    `note` = NULL,
    #' Initialize a new PinCreate class.
    #'
    #' @description
    #' Initialize a new PinCreate class.
    #'
    #' @param id id
    #' @param created_at created_at
    #' @param link link
    #' @param title title
    #' @param description description
    #' @param dominant_color Dominant pin color. Hex number, e.g. \\\"#6E7874\\\".
    #' @param alt_text alt_text
    #' @param board_id The board to which this Pin belongs.
    #' @param board_section_id The board section to which this Pin belongs.
    #' @param board_owner board_owner
    #' @param media media
    #' @param media_source media_source
    #' @param parent_pin_id The source pin id if this pin was saved from another pin. <a href=\"https://help.pinterest.com/article/save-pins-on-pinterest\">Learn more</a>.
    #' @param note Private note for this Pin. <a href=\"https://help.pinterest.com/en/article/add-notes-to-your-pins\">Learn more</a>.
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`id` = NULL, `created_at` = NULL, `link` = NULL, `title` = NULL, `description` = NULL, `dominant_color` = NULL, `alt_text` = NULL, `board_id` = NULL, `board_section_id` = NULL, `board_owner` = NULL, `media` = NULL, `media_source` = NULL, `parent_pin_id` = NULL, `note` = NULL, ...) {
      if (!is.null(`id`)) {
        if (!(is.character(`id`) && length(`id`) == 1)) {
          stop(paste("Error! Invalid data for `id`. Must be a string:", `id`))
        }
        self$`id` <- `id`
      }
      if (!is.null(`created_at`)) {
        if (!is.character(`created_at`)) {
          stop(paste("Error! Invalid data for `created_at`. Must be a string:", `created_at`))
        }
        self$`created_at` <- `created_at`
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
      if (!is.null(`description`)) {
        if (!(is.character(`description`) && length(`description`) == 1)) {
          stop(paste("Error! Invalid data for `description`. Must be a string:", `description`))
        }
        self$`description` <- `description`
      }
      if (!is.null(`dominant_color`)) {
        if (!(is.character(`dominant_color`) && length(`dominant_color`) == 1)) {
          stop(paste("Error! Invalid data for `dominant_color`. Must be a string:", `dominant_color`))
        }
        self$`dominant_color` <- `dominant_color`
      }
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
      if (!is.null(`board_owner`)) {
        stopifnot(R6::is.R6(`board_owner`))
        self$`board_owner` <- `board_owner`
      }
      if (!is.null(`media`)) {
        stopifnot(R6::is.R6(`media`))
        self$`media` <- `media`
      }
      if (!is.null(`media_source`)) {
        stopifnot(R6::is.R6(`media_source`))
        self$`media_source` <- `media_source`
      }
      if (!is.null(`parent_pin_id`)) {
        if (!(is.character(`parent_pin_id`) && length(`parent_pin_id`) == 1)) {
          stop(paste("Error! Invalid data for `parent_pin_id`. Must be a string:", `parent_pin_id`))
        }
        self$`parent_pin_id` <- `parent_pin_id`
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
    #' @return PinCreate in JSON format
    #' @export
    toJSON = function() {
      PinCreateObject <- list()
      if (!is.null(self$`id`)) {
        PinCreateObject[["id"]] <-
          self$`id`
      }
      if (!is.null(self$`created_at`)) {
        PinCreateObject[["created_at"]] <-
          self$`created_at`
      }
      if (!is.null(self$`link`)) {
        PinCreateObject[["link"]] <-
          self$`link`
      }
      if (!is.null(self$`title`)) {
        PinCreateObject[["title"]] <-
          self$`title`
      }
      if (!is.null(self$`description`)) {
        PinCreateObject[["description"]] <-
          self$`description`
      }
      if (!is.null(self$`dominant_color`)) {
        PinCreateObject[["dominant_color"]] <-
          self$`dominant_color`
      }
      if (!is.null(self$`alt_text`)) {
        PinCreateObject[["alt_text"]] <-
          self$`alt_text`
      }
      if (!is.null(self$`board_id`)) {
        PinCreateObject[["board_id"]] <-
          self$`board_id`
      }
      if (!is.null(self$`board_section_id`)) {
        PinCreateObject[["board_section_id"]] <-
          self$`board_section_id`
      }
      if (!is.null(self$`board_owner`)) {
        PinCreateObject[["board_owner"]] <-
          self$`board_owner`$toJSON()
      }
      if (!is.null(self$`media`)) {
        PinCreateObject[["media"]] <-
          self$`media`$toJSON()
      }
      if (!is.null(self$`media_source`)) {
        PinCreateObject[["media_source"]] <-
          self$`media_source`$toJSON()
      }
      if (!is.null(self$`parent_pin_id`)) {
        PinCreateObject[["parent_pin_id"]] <-
          self$`parent_pin_id`
      }
      if (!is.null(self$`note`)) {
        PinCreateObject[["note"]] <-
          self$`note`
      }
      PinCreateObject
    },
    #' Deserialize JSON string into an instance of PinCreate
    #'
    #' @description
    #' Deserialize JSON string into an instance of PinCreate
    #'
    #' @param input_json the JSON input
    #' @return the instance of PinCreate
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`id`)) {
        self$`id` <- this_object$`id`
      }
      if (!is.null(this_object$`created_at`)) {
        self$`created_at` <- this_object$`created_at`
      }
      if (!is.null(this_object$`link`)) {
        self$`link` <- this_object$`link`
      }
      if (!is.null(this_object$`title`)) {
        self$`title` <- this_object$`title`
      }
      if (!is.null(this_object$`description`)) {
        self$`description` <- this_object$`description`
      }
      if (!is.null(this_object$`dominant_color`)) {
        self$`dominant_color` <- this_object$`dominant_color`
      }
      if (!is.null(this_object$`alt_text`)) {
        self$`alt_text` <- this_object$`alt_text`
      }
      if (!is.null(this_object$`board_id`)) {
        self$`board_id` <- this_object$`board_id`
      }
      if (!is.null(this_object$`board_section_id`)) {
        self$`board_section_id` <- this_object$`board_section_id`
      }
      if (!is.null(this_object$`board_owner`)) {
        `board_owner_object` <- BoardOwner$new()
        `board_owner_object`$fromJSON(jsonlite::toJSON(this_object$`board_owner`, auto_unbox = TRUE, digits = NA))
        self$`board_owner` <- `board_owner_object`
      }
      if (!is.null(this_object$`media`)) {
        `media_object` <- SummaryPinMedia$new()
        `media_object`$fromJSON(jsonlite::toJSON(this_object$`media`, auto_unbox = TRUE, digits = NA))
        self$`media` <- `media_object`
      }
      if (!is.null(this_object$`media_source`)) {
        `media_source_object` <- PinMediaSource$new()
        `media_source_object`$fromJSON(jsonlite::toJSON(this_object$`media_source`, auto_unbox = TRUE, digits = NA))
        self$`media_source` <- `media_source_object`
      }
      if (!is.null(this_object$`parent_pin_id`)) {
        self$`parent_pin_id` <- this_object$`parent_pin_id`
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
    #' @return PinCreate in JSON format
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
        if (!is.null(self$`created_at`)) {
          sprintf(
          '"created_at":
            "%s"
                    ',
          self$`created_at`
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
        if (!is.null(self$`description`)) {
          sprintf(
          '"description":
            "%s"
                    ',
          self$`description`
          )
        },
        if (!is.null(self$`dominant_color`)) {
          sprintf(
          '"dominant_color":
            "%s"
                    ',
          self$`dominant_color`
          )
        },
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
        if (!is.null(self$`board_owner`)) {
          sprintf(
          '"board_owner":
          %s
          ',
          jsonlite::toJSON(self$`board_owner`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        },
        if (!is.null(self$`media`)) {
          sprintf(
          '"media":
          %s
          ',
          jsonlite::toJSON(self$`media`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        },
        if (!is.null(self$`media_source`)) {
          sprintf(
          '"media_source":
          %s
          ',
          jsonlite::toJSON(self$`media_source`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        },
        if (!is.null(self$`parent_pin_id`)) {
          sprintf(
          '"parent_pin_id":
            "%s"
                    ',
          self$`parent_pin_id`
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
    #' Deserialize JSON string into an instance of PinCreate
    #'
    #' @description
    #' Deserialize JSON string into an instance of PinCreate
    #'
    #' @param input_json the JSON input
    #' @return the instance of PinCreate
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`id` <- this_object$`id`
      self$`created_at` <- this_object$`created_at`
      self$`link` <- this_object$`link`
      self$`title` <- this_object$`title`
      self$`description` <- this_object$`description`
      self$`dominant_color` <- this_object$`dominant_color`
      self$`alt_text` <- this_object$`alt_text`
      self$`board_id` <- this_object$`board_id`
      self$`board_section_id` <- this_object$`board_section_id`
      self$`board_owner` <- BoardOwner$new()$fromJSON(jsonlite::toJSON(this_object$`board_owner`, auto_unbox = TRUE, digits = NA))
      self$`media` <- SummaryPinMedia$new()$fromJSON(jsonlite::toJSON(this_object$`media`, auto_unbox = TRUE, digits = NA))
      self$`media_source` <- PinMediaSource$new()$fromJSON(jsonlite::toJSON(this_object$`media_source`, auto_unbox = TRUE, digits = NA))
      self$`parent_pin_id` <- this_object$`parent_pin_id`
      self$`note` <- this_object$`note`
      self
    },
    #' Validate JSON input with respect to PinCreate
    #'
    #' @description
    #' Validate JSON input with respect to PinCreate and throw an exception if invalid
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
    #' @return String representation of PinCreate
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
      if (!str_detect(self$`id`, "^\\d+$")) {
        return(FALSE)
      }

      if (nchar(self$`link`) > 2048) {
        return(FALSE)
      }

      if (nchar(self$`title`) > 100) {
        return(FALSE)
      }

      if (nchar(self$`description`) > 800) {
        return(FALSE)
      }

      if (nchar(self$`alt_text`) > 500) {
        return(FALSE)
      }

      if (!str_detect(self$`board_id`, "^\\d+$")) {
        return(FALSE)
      }

      if (!str_detect(self$`board_section_id`, "^\\d+$")) {
        return(FALSE)
      }

      if (!str_detect(self$`parent_pin_id`, "^\\d+$")) {
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
      if (!str_detect(self$`id`, "^\\d+$")) {
        invalid_fields["id"] <- "Invalid value for `id`, must conform to the pattern ^\\d+$."
      }

      if (nchar(self$`link`) > 2048) {
        invalid_fields["link"] <- "Invalid length for `link`, must be smaller than or equal to 2048."
      }

      if (nchar(self$`title`) > 100) {
        invalid_fields["title"] <- "Invalid length for `title`, must be smaller than or equal to 100."
      }

      if (nchar(self$`description`) > 800) {
        invalid_fields["description"] <- "Invalid length for `description`, must be smaller than or equal to 800."
      }

      if (nchar(self$`alt_text`) > 500) {
        invalid_fields["alt_text"] <- "Invalid length for `alt_text`, must be smaller than or equal to 500."
      }

      if (!str_detect(self$`board_id`, "^\\d+$")) {
        invalid_fields["board_id"] <- "Invalid value for `board_id`, must conform to the pattern ^\\d+$."
      }

      if (!str_detect(self$`board_section_id`, "^\\d+$")) {
        invalid_fields["board_section_id"] <- "Invalid value for `board_section_id`, must conform to the pattern ^\\d+$."
      }

      if (!str_detect(self$`parent_pin_id`, "^\\d+$")) {
        invalid_fields["parent_pin_id"] <- "Invalid value for `parent_pin_id`, must conform to the pattern ^\\d+$."
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
# PinCreate$unlock()
#
## Below is an example to define the print function
# PinCreate$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# PinCreate$lock()

