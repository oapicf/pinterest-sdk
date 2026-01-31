#' Create a new BoardWithUpdatePrivacy
#'
#' @description
#' BoardWithUpdatePrivacy Class
#'
#' @docType class
#' @title BoardWithUpdatePrivacy
#' @description BoardWithUpdatePrivacy Class
#' @format An \code{R6Class} generator object
#' @field board_pins_modified_at Date and time of last board pins modified. character [optional]
#' @field collaborator_count Count of collaborators on the board. integer [optional]
#' @field created_at Date and time of board creation. character [optional]
#' @field description  character [optional]
#' @field follower_count Board follower count. integer [optional]
#' @field id  character
#' @field is_ads_only If set to `true`, the board will be ad-only and can store ad-only Pins. character [optional]
#' @field media Board media. \link{BoardMedia} [optional]
#' @field name Name of the board.      **Note:** If you create an ad-only board by setting `is_ads_only`     to `true`, the board name automatically becomes \"Ad-only Pins\". character
#' @field owner  \link{BoardOwner} [optional]
#' @field pin_count Count of Pins on the board. integer [optional]
#' @field privacy  \link{BoardUpdatePrivacy} [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
BoardWithUpdatePrivacy <- R6::R6Class(
  "BoardWithUpdatePrivacy",
  public = list(
    `board_pins_modified_at` = NULL,
    `collaborator_count` = NULL,
    `created_at` = NULL,
    `description` = NULL,
    `follower_count` = NULL,
    `id` = NULL,
    `is_ads_only` = NULL,
    `media` = NULL,
    `name` = NULL,
    `owner` = NULL,
    `pin_count` = NULL,
    `privacy` = NULL,

    #' @description
    #' Initialize a new BoardWithUpdatePrivacy class.
    #'
    #' @param id id
    #' @param name Name of the board.      **Note:** If you create an ad-only board by setting `is_ads_only`     to `true`, the board name automatically becomes \"Ad-only Pins\".
    #' @param board_pins_modified_at Date and time of last board pins modified.
    #' @param collaborator_count Count of collaborators on the board.
    #' @param created_at Date and time of board creation.
    #' @param description description
    #' @param follower_count Board follower count.
    #' @param is_ads_only If set to `true`, the board will be ad-only and can store ad-only Pins.. Default to FALSE.
    #' @param media Board media.
    #' @param owner owner
    #' @param pin_count Count of Pins on the board.
    #' @param privacy privacy
    #' @param ... Other optional arguments.
    initialize = function(`id`, `name`, `board_pins_modified_at` = NULL, `collaborator_count` = NULL, `created_at` = NULL, `description` = NULL, `follower_count` = NULL, `is_ads_only` = FALSE, `media` = NULL, `owner` = NULL, `pin_count` = NULL, `privacy` = NULL, ...) {
      if (!missing(`id`)) {
        if (!(is.character(`id`) && length(`id`) == 1)) {
          stop(paste("Error! Invalid data for `id`. Must be a string:", `id`))
        }
        self$`id` <- `id`
      }
      if (!missing(`name`)) {
        if (!(is.character(`name`) && length(`name`) == 1)) {
          stop(paste("Error! Invalid data for `name`. Must be a string:", `name`))
        }
        self$`name` <- `name`
      }
      if (!is.null(`board_pins_modified_at`)) {
        if (!is.character(`board_pins_modified_at`)) {
          stop(paste("Error! Invalid data for `board_pins_modified_at`. Must be a string:", `board_pins_modified_at`))
        }
        self$`board_pins_modified_at` <- `board_pins_modified_at`
      }
      if (!is.null(`collaborator_count`)) {
        if (!(is.numeric(`collaborator_count`) && length(`collaborator_count`) == 1)) {
          stop(paste("Error! Invalid data for `collaborator_count`. Must be an integer:", `collaborator_count`))
        }
        self$`collaborator_count` <- `collaborator_count`
      }
      if (!is.null(`created_at`)) {
        if (!is.character(`created_at`)) {
          stop(paste("Error! Invalid data for `created_at`. Must be a string:", `created_at`))
        }
        self$`created_at` <- `created_at`
      }
      if (!is.null(`description`)) {
        if (!(is.character(`description`) && length(`description`) == 1)) {
          stop(paste("Error! Invalid data for `description`. Must be a string:", `description`))
        }
        self$`description` <- `description`
      }
      if (!is.null(`follower_count`)) {
        if (!(is.numeric(`follower_count`) && length(`follower_count`) == 1)) {
          stop(paste("Error! Invalid data for `follower_count`. Must be an integer:", `follower_count`))
        }
        self$`follower_count` <- `follower_count`
      }
      if (!is.null(`is_ads_only`)) {
        if (!(is.logical(`is_ads_only`) && length(`is_ads_only`) == 1)) {
          stop(paste("Error! Invalid data for `is_ads_only`. Must be a boolean:", `is_ads_only`))
        }
        self$`is_ads_only` <- `is_ads_only`
      }
      if (!is.null(`media`)) {
        stopifnot(R6::is.R6(`media`))
        self$`media` <- `media`
      }
      if (!is.null(`owner`)) {
        stopifnot(R6::is.R6(`owner`))
        self$`owner` <- `owner`
      }
      if (!is.null(`pin_count`)) {
        if (!(is.numeric(`pin_count`) && length(`pin_count`) == 1)) {
          stop(paste("Error! Invalid data for `pin_count`. Must be an integer:", `pin_count`))
        }
        self$`pin_count` <- `pin_count`
      }
      if (!is.null(`privacy`)) {
        if (!(`privacy` %in% c())) {
          stop(paste("Error! \"", `privacy`, "\" cannot be assigned to `privacy`. Must be .", sep = ""))
        }
        stopifnot(R6::is.R6(`privacy`))
        self$`privacy` <- `privacy`
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
    #' @return BoardWithUpdatePrivacy as a base R list.
    #' @examples
    #' # convert array of BoardWithUpdatePrivacy (x) to a data frame
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
    #' Convert BoardWithUpdatePrivacy to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      BoardWithUpdatePrivacyObject <- list()
      if (!is.null(self$`board_pins_modified_at`)) {
        BoardWithUpdatePrivacyObject[["board_pins_modified_at"]] <-
          self$`board_pins_modified_at`
      }
      if (!is.null(self$`collaborator_count`)) {
        BoardWithUpdatePrivacyObject[["collaborator_count"]] <-
          self$`collaborator_count`
      }
      if (!is.null(self$`created_at`)) {
        BoardWithUpdatePrivacyObject[["created_at"]] <-
          self$`created_at`
      }
      if (!is.null(self$`description`)) {
        BoardWithUpdatePrivacyObject[["description"]] <-
          self$`description`
      }
      if (!is.null(self$`follower_count`)) {
        BoardWithUpdatePrivacyObject[["follower_count"]] <-
          self$`follower_count`
      }
      if (!is.null(self$`id`)) {
        BoardWithUpdatePrivacyObject[["id"]] <-
          self$`id`
      }
      if (!is.null(self$`is_ads_only`)) {
        BoardWithUpdatePrivacyObject[["is_ads_only"]] <-
          self$`is_ads_only`
      }
      if (!is.null(self$`media`)) {
        BoardWithUpdatePrivacyObject[["media"]] <-
          self$`media`$toSimpleType()
      }
      if (!is.null(self$`name`)) {
        BoardWithUpdatePrivacyObject[["name"]] <-
          self$`name`
      }
      if (!is.null(self$`owner`)) {
        BoardWithUpdatePrivacyObject[["owner"]] <-
          self$`owner`$toSimpleType()
      }
      if (!is.null(self$`pin_count`)) {
        BoardWithUpdatePrivacyObject[["pin_count"]] <-
          self$`pin_count`
      }
      if (!is.null(self$`privacy`)) {
        BoardWithUpdatePrivacyObject[["privacy"]] <-
          self$`privacy`$toSimpleType()
      }
      return(BoardWithUpdatePrivacyObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of BoardWithUpdatePrivacy
    #'
    #' @param input_json the JSON input
    #' @return the instance of BoardWithUpdatePrivacy
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`board_pins_modified_at`)) {
        self$`board_pins_modified_at` <- this_object$`board_pins_modified_at`
      }
      if (!is.null(this_object$`collaborator_count`)) {
        self$`collaborator_count` <- this_object$`collaborator_count`
      }
      if (!is.null(this_object$`created_at`)) {
        self$`created_at` <- this_object$`created_at`
      }
      if (!is.null(this_object$`description`)) {
        self$`description` <- this_object$`description`
      }
      if (!is.null(this_object$`follower_count`)) {
        self$`follower_count` <- this_object$`follower_count`
      }
      if (!is.null(this_object$`id`)) {
        self$`id` <- this_object$`id`
      }
      if (!is.null(this_object$`is_ads_only`)) {
        self$`is_ads_only` <- this_object$`is_ads_only`
      }
      if (!is.null(this_object$`media`)) {
        `media_object` <- BoardMedia$new()
        `media_object`$fromJSON(jsonlite::toJSON(this_object$`media`, auto_unbox = TRUE, digits = NA))
        self$`media` <- `media_object`
      }
      if (!is.null(this_object$`name`)) {
        self$`name` <- this_object$`name`
      }
      if (!is.null(this_object$`owner`)) {
        `owner_object` <- BoardOwner$new()
        `owner_object`$fromJSON(jsonlite::toJSON(this_object$`owner`, auto_unbox = TRUE, digits = NA))
        self$`owner` <- `owner_object`
      }
      if (!is.null(this_object$`pin_count`)) {
        self$`pin_count` <- this_object$`pin_count`
      }
      if (!is.null(this_object$`privacy`)) {
        `privacy_object` <- BoardUpdatePrivacy$new()
        `privacy_object`$fromJSON(jsonlite::toJSON(this_object$`privacy`, auto_unbox = TRUE, digits = NA))
        self$`privacy` <- `privacy_object`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return BoardWithUpdatePrivacy in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of BoardWithUpdatePrivacy
    #'
    #' @param input_json the JSON input
    #' @return the instance of BoardWithUpdatePrivacy
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`board_pins_modified_at` <- this_object$`board_pins_modified_at`
      self$`collaborator_count` <- this_object$`collaborator_count`
      self$`created_at` <- this_object$`created_at`
      self$`description` <- this_object$`description`
      self$`follower_count` <- this_object$`follower_count`
      self$`id` <- this_object$`id`
      self$`is_ads_only` <- this_object$`is_ads_only`
      self$`media` <- BoardMedia$new()$fromJSON(jsonlite::toJSON(this_object$`media`, auto_unbox = TRUE, digits = NA))
      self$`name` <- this_object$`name`
      self$`owner` <- BoardOwner$new()$fromJSON(jsonlite::toJSON(this_object$`owner`, auto_unbox = TRUE, digits = NA))
      self$`pin_count` <- this_object$`pin_count`
      self$`privacy` <- BoardUpdatePrivacy$new()$fromJSON(jsonlite::toJSON(this_object$`privacy`, auto_unbox = TRUE, digits = NA))
      self
    },

    #' @description
    #' Validate JSON input with respect to BoardWithUpdatePrivacy and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `id`
      if (!is.null(input_json$`id`)) {
        if (!(is.character(input_json$`id`) && length(input_json$`id`) == 1)) {
          stop(paste("Error! Invalid data for `id`. Must be a string:", input_json$`id`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for BoardWithUpdatePrivacy: the required field `id` is missing."))
      }
      # check the required field `name`
      if (!is.null(input_json$`name`)) {
        if (!(is.character(input_json$`name`) && length(input_json$`name`) == 1)) {
          stop(paste("Error! Invalid data for `name`. Must be a string:", input_json$`name`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for BoardWithUpdatePrivacy: the required field `name` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of BoardWithUpdatePrivacy
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      if (self$`collaborator_count` < 0) {
        return(FALSE)
      }

      if (self$`follower_count` < 0) {
        return(FALSE)
      }

      # check if the required `id` is null
      if (is.null(self$`id`)) {
        return(FALSE)
      }

      if (!str_detect(self$`id`, "^\\d+$")) {
        return(FALSE)
      }

      # check if the required `name` is null
      if (is.null(self$`name`)) {
        return(FALSE)
      }

      if (self$`pin_count` < 0) {
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
      if (self$`collaborator_count` < 0) {
        invalid_fields["collaborator_count"] <- "Invalid value for `collaborator_count`, must be bigger than or equal to 0."
      }

      if (self$`follower_count` < 0) {
        invalid_fields["follower_count"] <- "Invalid value for `follower_count`, must be bigger than or equal to 0."
      }

      # check if the required `id` is null
      if (is.null(self$`id`)) {
        invalid_fields["id"] <- "Non-nullable required field `id` cannot be null."
      }

      if (!str_detect(self$`id`, "^\\d+$")) {
        invalid_fields["id"] <- "Invalid value for `id`, must conform to the pattern ^\\d+$."
      }

      # check if the required `name` is null
      if (is.null(self$`name`)) {
        invalid_fields["name"] <- "Non-nullable required field `name` cannot be null."
      }

      if (self$`pin_count` < 0) {
        invalid_fields["pin_count"] <- "Invalid value for `pin_count`, must be bigger than or equal to 0."
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
# BoardWithUpdatePrivacy$unlock()
#
## Below is an example to define the print function
# BoardWithUpdatePrivacy$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# BoardWithUpdatePrivacy$lock()

