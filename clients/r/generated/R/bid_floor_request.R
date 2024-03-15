#' Create a new BidFloorRequest
#'
#' @description
#' BidFloorRequest Class
#'
#' @docType class
#' @title BidFloorRequest
#' @description BidFloorRequest Class
#' @format An \code{R6Class} generator object
#' @field bid_floor_specs  list(\link{BidFloorSpec})
#' @field targeting_spec  \link{TargetingSpec} [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
BidFloorRequest <- R6::R6Class(
  "BidFloorRequest",
  public = list(
    `bid_floor_specs` = NULL,
    `targeting_spec` = NULL,
    #' Initialize a new BidFloorRequest class.
    #'
    #' @description
    #' Initialize a new BidFloorRequest class.
    #'
    #' @param bid_floor_specs bid_floor_specs
    #' @param targeting_spec targeting_spec
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`bid_floor_specs`, `targeting_spec` = NULL, ...) {
      if (!missing(`bid_floor_specs`)) {
        stopifnot(is.vector(`bid_floor_specs`), length(`bid_floor_specs`) != 0)
        sapply(`bid_floor_specs`, function(x) stopifnot(R6::is.R6(x)))
        self$`bid_floor_specs` <- `bid_floor_specs`
      }
      if (!is.null(`targeting_spec`)) {
        stopifnot(R6::is.R6(`targeting_spec`))
        self$`targeting_spec` <- `targeting_spec`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return BidFloorRequest in JSON format
    #' @export
    toJSON = function() {
      BidFloorRequestObject <- list()
      if (!is.null(self$`bid_floor_specs`)) {
        BidFloorRequestObject[["bid_floor_specs"]] <-
          lapply(self$`bid_floor_specs`, function(x) x$toJSON())
      }
      if (!is.null(self$`targeting_spec`)) {
        BidFloorRequestObject[["targeting_spec"]] <-
          self$`targeting_spec`$toJSON()
      }
      BidFloorRequestObject
    },
    #' Deserialize JSON string into an instance of BidFloorRequest
    #'
    #' @description
    #' Deserialize JSON string into an instance of BidFloorRequest
    #'
    #' @param input_json the JSON input
    #' @return the instance of BidFloorRequest
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`bid_floor_specs`)) {
        self$`bid_floor_specs` <- ApiClient$new()$deserializeObj(this_object$`bid_floor_specs`, "array[BidFloorSpec]", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`targeting_spec`)) {
        `targeting_spec_object` <- TargetingSpec$new()
        `targeting_spec_object`$fromJSON(jsonlite::toJSON(this_object$`targeting_spec`, auto_unbox = TRUE, digits = NA))
        self$`targeting_spec` <- `targeting_spec_object`
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return BidFloorRequest in JSON format
    #' @export
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`bid_floor_specs`)) {
          sprintf(
          '"bid_floor_specs":
          [%s]
',
          paste(sapply(self$`bid_floor_specs`, function(x) jsonlite::toJSON(x$toJSON(), auto_unbox = TRUE, digits = NA)), collapse = ",")
          )
        },
        if (!is.null(self$`targeting_spec`)) {
          sprintf(
          '"targeting_spec":
          %s
          ',
          jsonlite::toJSON(self$`targeting_spec`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of BidFloorRequest
    #'
    #' @description
    #' Deserialize JSON string into an instance of BidFloorRequest
    #'
    #' @param input_json the JSON input
    #' @return the instance of BidFloorRequest
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`bid_floor_specs` <- ApiClient$new()$deserializeObj(this_object$`bid_floor_specs`, "array[BidFloorSpec]", loadNamespace("openapi"))
      self$`targeting_spec` <- TargetingSpec$new()$fromJSON(jsonlite::toJSON(this_object$`targeting_spec`, auto_unbox = TRUE, digits = NA))
      self
    },
    #' Validate JSON input with respect to BidFloorRequest
    #'
    #' @description
    #' Validate JSON input with respect to BidFloorRequest and throw an exception if invalid
    #'
    #' @param input the JSON input
    #' @export
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `bid_floor_specs`
      if (!is.null(input_json$`bid_floor_specs`)) {
        stopifnot(is.vector(input_json$`bid_floor_specs`), length(input_json$`bid_floor_specs`) != 0)
        tmp <- sapply(input_json$`bid_floor_specs`, function(x) stopifnot(R6::is.R6(x)))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for BidFloorRequest: the required field `bid_floor_specs` is missing."))
      }
    },
    #' To string (JSON format)
    #'
    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of BidFloorRequest
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
      # check if the required `bid_floor_specs` is null
      if (is.null(self$`bid_floor_specs`)) {
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
      # check if the required `bid_floor_specs` is null
      if (is.null(self$`bid_floor_specs`)) {
        invalid_fields["bid_floor_specs"] <- "Non-nullable required field `bid_floor_specs` cannot be null."
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
# BidFloorRequest$unlock()
#
## Below is an example to define the print function
# BidFloorRequest$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# BidFloorRequest$lock()

