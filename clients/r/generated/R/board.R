#' Create a new Board
#'
#' @description
#' Board
#'
#' @docType class
#' @title Board
#' @description Board Class
#' @format An \code{R6Class} generator object
#' @field id  character [optional]
#' @field created_at Date and time of board creation. character [optional]
#' @field board_pins_modified_at Date and time of last board pins modified. character [optional]
#' @field name  character
#' @field description  character [optional]
#' @field collaborator_count Count of collaborators on the board. integer [optional]
#' @field pin_count Count of pins on the board. integer [optional]
#' @field follower_count Board follower count. integer [optional]
#' @field media  \link{BoardMedia} [optional]
#' @field owner  \link{BoardOwner} [optional]
#' @field privacy Privacy setting for a board. Learn more about <a href=\"https://help.pinterest.com/en/article/secret-boards\">secret boards</a> and <a href=\"https://help.pinterest.com/en/business/article/protected-boards\">protected boards</a> character [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
Board <- R6::R6Class(
  "Board",
  public = list(
    `id` = NULL,
    `created_at` = NULL,
    `board_pins_modified_at` = NULL,
    `name` = NULL,
    `description` = NULL,
    `collaborator_count` = NULL,
    `pin_count` = NULL,
    `follower_count` = NULL,
    `media` = NULL,
    `owner` = NULL,
    `privacy` = NULL,

    #' @description
    #' Initialize a new Board class.
    #'
    #' @param name name
    #' @param id id
    #' @param created_at Date and time of board creation.
    #' @param board_pins_modified_at Date and time of last board pins modified.
    #' @param description description
    #' @param collaborator_count Count of collaborators on the board.
    #' @param pin_count Count of pins on the board.
    #' @param follower_count Board follower count.
    #' @param media media
    #' @param owner owner
    #' @param privacy Privacy setting for a board. Learn more about <a href=\"https://help.pinterest.com/en/article/secret-boards\">secret boards</a> and <a href=\"https://help.pinterest.com/en/business/article/protected-boards\">protected boards</a>. Default to "PUBLIC".
    #' @param ... Other optional arguments.
    initialize = function(`name`, `id` = NULL, `created_at` = NULL, `board_pins_modified_at` = NULL, `description` = NULL, `collaborator_count` = NULL, `pin_count` = NULL, `follower_count` = NULL, `media` = NULL, `owner` = NULL, `privacy` = "PUBLIC", ...) {
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
      if (!is.null(`created_at`)) {
        if (!is.character(`created_at`)) {
          stop(paste("Error! Invalid data for `created_at`. Must be a string:", `created_at`))
        }
        self$`created_at` <- `created_at`
      }
      if (!is.null(`board_pins_modified_at`)) {
        if (!is.character(`board_pins_modified_at`)) {
          stop(paste("Error! Invalid data for `board_pins_modified_at`. Must be a string:", `board_pins_modified_at`))
        }
        self$`board_pins_modified_at` <- `board_pins_modified_at`
      }
      if (!is.null(`description`)) {
        if (!(is.character(`description`) && length(`description`) == 1)) {
          stop(paste("Error! Invalid data for `description`. Must be a string:", `description`))
        }
        self$`description` <- `description`
      }
      if (!is.null(`collaborator_count`)) {
        if (!(is.numeric(`collaborator_count`) && length(`collaborator_count`) == 1)) {
          stop(paste("Error! Invalid data for `collaborator_count`. Must be an integer:", `collaborator_count`))
        }
        self$`collaborator_count` <- `collaborator_count`
      }
      if (!is.null(`pin_count`)) {
        if (!(is.numeric(`pin_count`) && length(`pin_count`) == 1)) {
          stop(paste("Error! Invalid data for `pin_count`. Must be an integer:", `pin_count`))
        }
        self$`pin_count` <- `pin_count`
      }
      if (!is.null(`follower_count`)) {
        if (!(is.numeric(`follower_count`) && length(`follower_count`) == 1)) {
          stop(paste("Error! Invalid data for `follower_count`. Must be an integer:", `follower_count`))
        }
        self$`follower_count` <- `follower_count`
      }
      if (!is.null(`media`)) {
        stopifnot(R6::is.R6(`media`))
        self$`media` <- `media`
      }
      if (!is.null(`owner`)) {
        stopifnot(R6::is.R6(`owner`))
        self$`owner` <- `owner`
      }
      if (!is.null(`privacy`)) {
        if (!(`privacy` %in% c("PUBLIC", "PROTECTED", "SECRET"))) {
          stop(paste("Error! \"", `privacy`, "\" cannot be assigned to `privacy`. Must be \"PUBLIC\", \"PROTECTED\", \"SECRET\".", sep = ""))
        }
        if (!(is.character(`privacy`) && length(`privacy`) == 1)) {
          stop(paste("Error! Invalid data for `privacy`. Must be a string:", `privacy`))
        }
        self$`privacy` <- `privacy`
      }
    },

    #' @description
    #' To JSON String
    #'
    #' @return Board in JSON format
    toJSON = function() {
      BoardObject <- list()
      if (!is.null(self$`id`)) {
        BoardObject[["id"]] <-
          self$`id`
      }
      if (!is.null(self$`created_at`)) {
        BoardObject[["created_at"]] <-
          self$`created_at`
      }
      if (!is.null(self$`board_pins_modified_at`)) {
        BoardObject[["board_pins_modified_at"]] <-
          self$`board_pins_modified_at`
      }
      if (!is.null(self$`name`)) {
        BoardObject[["name"]] <-
          self$`name`
      }
      if (!is.null(self$`description`)) {
        BoardObject[["description"]] <-
          self$`description`
      }
      if (!is.null(self$`collaborator_count`)) {
        BoardObject[["collaborator_count"]] <-
          self$`collaborator_count`
      }
      if (!is.null(self$`pin_count`)) {
        BoardObject[["pin_count"]] <-
          self$`pin_count`
      }
      if (!is.null(self$`follower_count`)) {
        BoardObject[["follower_count"]] <-
          self$`follower_count`
      }
      if (!is.null(self$`media`)) {
        BoardObject[["media"]] <-
          self$`media`$toJSON()
      }
      if (!is.null(self$`owner`)) {
        BoardObject[["owner"]] <-
          self$`owner`$toJSON()
      }
      if (!is.null(self$`privacy`)) {
        BoardObject[["privacy"]] <-
          self$`privacy`
      }
      BoardObject
    },

    #' @description
    #' Deserialize JSON string into an instance of Board
    #'
    #' @param input_json the JSON input
    #' @return the instance of Board
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`id`)) {
        self$`id` <- this_object$`id`
      }
      if (!is.null(this_object$`created_at`)) {
        self$`created_at` <- this_object$`created_at`
      }
      if (!is.null(this_object$`board_pins_modified_at`)) {
        self$`board_pins_modified_at` <- this_object$`board_pins_modified_at`
      }
      if (!is.null(this_object$`name`)) {
        self$`name` <- this_object$`name`
      }
      if (!is.null(this_object$`description`)) {
        self$`description` <- this_object$`description`
      }
      if (!is.null(this_object$`collaborator_count`)) {
        self$`collaborator_count` <- this_object$`collaborator_count`
      }
      if (!is.null(this_object$`pin_count`)) {
        self$`pin_count` <- this_object$`pin_count`
      }
      if (!is.null(this_object$`follower_count`)) {
        self$`follower_count` <- this_object$`follower_count`
      }
      if (!is.null(this_object$`media`)) {
        `media_object` <- BoardMedia$new()
        `media_object`$fromJSON(jsonlite::toJSON(this_object$`media`, auto_unbox = TRUE, digits = NA))
        self$`media` <- `media_object`
      }
      if (!is.null(this_object$`owner`)) {
        `owner_object` <- BoardOwner$new()
        `owner_object`$fromJSON(jsonlite::toJSON(this_object$`owner`, auto_unbox = TRUE, digits = NA))
        self$`owner` <- `owner_object`
      }
      if (!is.null(this_object$`privacy`)) {
        if (!is.null(this_object$`privacy`) && !(this_object$`privacy` %in% c("PUBLIC", "PROTECTED", "SECRET"))) {
          stop(paste("Error! \"", this_object$`privacy`, "\" cannot be assigned to `privacy`. Must be \"PUBLIC\", \"PROTECTED\", \"SECRET\".", sep = ""))
        }
        self$`privacy` <- this_object$`privacy`
      }
      self
    },

    #' @description
    #' To JSON String
    #'
    #' @return Board in JSON format
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
        if (!is.null(self$`board_pins_modified_at`)) {
          sprintf(
          '"board_pins_modified_at":
            "%s"
                    ',
          self$`board_pins_modified_at`
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
        if (!is.null(self$`description`)) {
          sprintf(
          '"description":
            "%s"
                    ',
          self$`description`
          )
        },
        if (!is.null(self$`collaborator_count`)) {
          sprintf(
          '"collaborator_count":
            %d
                    ',
          self$`collaborator_count`
          )
        },
        if (!is.null(self$`pin_count`)) {
          sprintf(
          '"pin_count":
            %d
                    ',
          self$`pin_count`
          )
        },
        if (!is.null(self$`follower_count`)) {
          sprintf(
          '"follower_count":
            %d
                    ',
          self$`follower_count`
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
        if (!is.null(self$`owner`)) {
          sprintf(
          '"owner":
          %s
          ',
          jsonlite::toJSON(self$`owner`$toJSON(), auto_unbox = TRUE, digits = NA)
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

    #' @description
    #' Deserialize JSON string into an instance of Board
    #'
    #' @param input_json the JSON input
    #' @return the instance of Board
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`id` <- this_object$`id`
      self$`created_at` <- this_object$`created_at`
      self$`board_pins_modified_at` <- this_object$`board_pins_modified_at`
      self$`name` <- this_object$`name`
      self$`description` <- this_object$`description`
      self$`collaborator_count` <- this_object$`collaborator_count`
      self$`pin_count` <- this_object$`pin_count`
      self$`follower_count` <- this_object$`follower_count`
      self$`media` <- BoardMedia$new()$fromJSON(jsonlite::toJSON(this_object$`media`, auto_unbox = TRUE, digits = NA))
      self$`owner` <- BoardOwner$new()$fromJSON(jsonlite::toJSON(this_object$`owner`, auto_unbox = TRUE, digits = NA))
      if (!is.null(this_object$`privacy`) && !(this_object$`privacy` %in% c("PUBLIC", "PROTECTED", "SECRET"))) {
        stop(paste("Error! \"", this_object$`privacy`, "\" cannot be assigned to `privacy`. Must be \"PUBLIC\", \"PROTECTED\", \"SECRET\".", sep = ""))
      }
      self$`privacy` <- this_object$`privacy`
      self
    },

    #' @description
    #' Validate JSON input with respect to Board and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `name`
      if (!is.null(input_json$`name`)) {
        if (!(is.character(input_json$`name`) && length(input_json$`name`) == 1)) {
          stop(paste("Error! Invalid data for `name`. Must be a string:", input_json$`name`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for Board: the required field `name` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of Board
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      # check if the required `name` is null
      if (is.null(self$`name`)) {
        return(FALSE)
      }

      if (self$`collaborator_count` < 0) {
        return(FALSE)
      }

      if (self$`pin_count` < 0) {
        return(FALSE)
      }

      if (self$`follower_count` < 0) {
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
      # check if the required `name` is null
      if (is.null(self$`name`)) {
        invalid_fields["name"] <- "Non-nullable required field `name` cannot be null."
      }

      if (self$`collaborator_count` < 0) {
        invalid_fields["collaborator_count"] <- "Invalid value for `collaborator_count`, must be bigger than or equal to 0."
      }

      if (self$`pin_count` < 0) {
        invalid_fields["pin_count"] <- "Invalid value for `pin_count`, must be bigger than or equal to 0."
      }

      if (self$`follower_count` < 0) {
        invalid_fields["follower_count"] <- "Invalid value for `follower_count`, must be bigger than or equal to 0."
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
# Board$unlock()
#
## Below is an example to define the print function
# Board$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# Board$lock()

