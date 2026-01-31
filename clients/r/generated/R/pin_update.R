#' Create a new PinUpdate
#'
#' @description
#' Resource create or update operation model.
#'
#' @docType class
#' @title PinUpdate
#' @description PinUpdate Class
#' @format An \code{R6Class} generator object
#' @field alt_text  character [optional]
#' @field board_id The board to which this Pin belongs. character [optional]
#' @field board_section_id The board section to which this Pin belongs. character [optional]
#' @field carousel_slots Carousel Pin slots data. list(\link{CarouselSlot}) [optional]
#' @field description  character [optional]
#' @field link  character [optional]
#' @field title  character [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
PinUpdate <- R6::R6Class(
  "PinUpdate",
  public = list(
    `alt_text` = NULL,
    `board_id` = NULL,
    `board_section_id` = NULL,
    `carousel_slots` = NULL,
    `description` = NULL,
    `link` = NULL,
    `title` = NULL,

    #' @description
    #' Initialize a new PinUpdate class.
    #'
    #' @param alt_text alt_text
    #' @param board_id The board to which this Pin belongs.
    #' @param board_section_id The board section to which this Pin belongs.
    #' @param carousel_slots Carousel Pin slots data.
    #' @param description description
    #' @param link link
    #' @param title title
    #' @param ... Other optional arguments.
    initialize = function(`alt_text` = NULL, `board_id` = NULL, `board_section_id` = NULL, `carousel_slots` = NULL, `description` = NULL, `link` = NULL, `title` = NULL, ...) {
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
      if (!is.null(`carousel_slots`)) {
        stopifnot(is.vector(`carousel_slots`), length(`carousel_slots`) != 0)
        sapply(`carousel_slots`, function(x) stopifnot(R6::is.R6(x)))
        self$`carousel_slots` <- `carousel_slots`
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
    #' @return PinUpdate as a base R list.
    #' @examples
    #' # convert array of PinUpdate (x) to a data frame
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
    #' Convert PinUpdate to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
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
      if (!is.null(self$`carousel_slots`)) {
        PinUpdateObject[["carousel_slots"]] <-
          lapply(self$`carousel_slots`, function(x) x$toSimpleType())
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
      return(PinUpdateObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of PinUpdate
    #'
    #' @param input_json the JSON input
    #' @return the instance of PinUpdate
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
      if (!is.null(this_object$`carousel_slots`)) {
        self$`carousel_slots` <- ApiClient$new()$deserializeObj(this_object$`carousel_slots`, "array[CarouselSlot]", loadNamespace("openapi"))
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
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return PinUpdate in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of PinUpdate
    #'
    #' @param input_json the JSON input
    #' @return the instance of PinUpdate
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`alt_text` <- this_object$`alt_text`
      self$`board_id` <- this_object$`board_id`
      self$`board_section_id` <- this_object$`board_section_id`
      self$`carousel_slots` <- ApiClient$new()$deserializeObj(this_object$`carousel_slots`, "array[CarouselSlot]", loadNamespace("openapi"))
      self$`description` <- this_object$`description`
      self$`link` <- this_object$`link`
      self$`title` <- this_object$`title`
      self
    },

    #' @description
    #' Validate JSON input with respect to PinUpdate and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of PinUpdate
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
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

    #' @description
    #' Return a list of invalid fields (if any).
    #'
    #' @return A list of invalid fields (if any).
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
# PinUpdate$unlock()
#
## Below is an example to define the print function
# PinUpdate$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# PinUpdate$lock()

