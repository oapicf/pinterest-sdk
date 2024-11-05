#' Create a new CatalogsUpdatableCreativeAssetsAttributes
#'
#' @description
#' CatalogsUpdatableCreativeAssetsAttributes Class
#'
#' @docType class
#' @title CatalogsUpdatableCreativeAssetsAttributes
#' @description CatalogsUpdatableCreativeAssetsAttributes Class
#' @format An \code{R6Class} generator object
#' @field title The name of the creative assets. character [optional]
#' @field description Brief description of the creative assets. character [optional]
#' @field link Link to the creative assets page. character [optional]
#' @field ios_deep_link IOS deep link to the creative assets page. character [optional]
#' @field android_deep_link Link to the creative assets page. character [optional]
#' @field google_product_category The categorization of the product based on the standardized Google Product Taxonomy. This is a set taxonomy. Both the text values and numeric codes are accepted. character [optional]
#' @field custom_label_0 Custom grouping of creative assets. character [optional]
#' @field custom_label_1 Custom grouping of creative assets. character [optional]
#' @field custom_label_2 Custom grouping of creative assets. character [optional]
#' @field custom_label_3 Custom grouping of creative assets. character [optional]
#' @field custom_label_4 Custom grouping of creative assets. character [optional]
#' @field visibility Visibility of the creative assets. Must be one of the following values (upper or lowercase): ‘visible’, ‘hidden’. character [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
CatalogsUpdatableCreativeAssetsAttributes <- R6::R6Class(
  "CatalogsUpdatableCreativeAssetsAttributes",
  public = list(
    `title` = NULL,
    `description` = NULL,
    `link` = NULL,
    `ios_deep_link` = NULL,
    `android_deep_link` = NULL,
    `google_product_category` = NULL,
    `custom_label_0` = NULL,
    `custom_label_1` = NULL,
    `custom_label_2` = NULL,
    `custom_label_3` = NULL,
    `custom_label_4` = NULL,
    `visibility` = NULL,

    #' @description
    #' Initialize a new CatalogsUpdatableCreativeAssetsAttributes class.
    #'
    #' @param title The name of the creative assets.
    #' @param description Brief description of the creative assets.
    #' @param link Link to the creative assets page.
    #' @param ios_deep_link IOS deep link to the creative assets page.
    #' @param android_deep_link Link to the creative assets page.
    #' @param google_product_category The categorization of the product based on the standardized Google Product Taxonomy. This is a set taxonomy. Both the text values and numeric codes are accepted.
    #' @param custom_label_0 Custom grouping of creative assets.
    #' @param custom_label_1 Custom grouping of creative assets.
    #' @param custom_label_2 Custom grouping of creative assets.
    #' @param custom_label_3 Custom grouping of creative assets.
    #' @param custom_label_4 Custom grouping of creative assets.
    #' @param visibility Visibility of the creative assets. Must be one of the following values (upper or lowercase): ‘visible’, ‘hidden’.
    #' @param ... Other optional arguments.
    initialize = function(`title` = NULL, `description` = NULL, `link` = NULL, `ios_deep_link` = NULL, `android_deep_link` = NULL, `google_product_category` = NULL, `custom_label_0` = NULL, `custom_label_1` = NULL, `custom_label_2` = NULL, `custom_label_3` = NULL, `custom_label_4` = NULL, `visibility` = NULL, ...) {
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
      if (!is.null(`link`)) {
        if (!(is.character(`link`) && length(`link`) == 1)) {
          stop(paste("Error! Invalid data for `link`. Must be a string:", `link`))
        }
        self$`link` <- `link`
      }
      if (!is.null(`ios_deep_link`)) {
        if (!(is.character(`ios_deep_link`) && length(`ios_deep_link`) == 1)) {
          stop(paste("Error! Invalid data for `ios_deep_link`. Must be a string:", `ios_deep_link`))
        }
        self$`ios_deep_link` <- `ios_deep_link`
      }
      if (!is.null(`android_deep_link`)) {
        if (!(is.character(`android_deep_link`) && length(`android_deep_link`) == 1)) {
          stop(paste("Error! Invalid data for `android_deep_link`. Must be a string:", `android_deep_link`))
        }
        self$`android_deep_link` <- `android_deep_link`
      }
      if (!is.null(`google_product_category`)) {
        if (!(is.character(`google_product_category`) && length(`google_product_category`) == 1)) {
          stop(paste("Error! Invalid data for `google_product_category`. Must be a string:", `google_product_category`))
        }
        self$`google_product_category` <- `google_product_category`
      }
      if (!is.null(`custom_label_0`)) {
        if (!(is.character(`custom_label_0`) && length(`custom_label_0`) == 1)) {
          stop(paste("Error! Invalid data for `custom_label_0`. Must be a string:", `custom_label_0`))
        }
        self$`custom_label_0` <- `custom_label_0`
      }
      if (!is.null(`custom_label_1`)) {
        if (!(is.character(`custom_label_1`) && length(`custom_label_1`) == 1)) {
          stop(paste("Error! Invalid data for `custom_label_1`. Must be a string:", `custom_label_1`))
        }
        self$`custom_label_1` <- `custom_label_1`
      }
      if (!is.null(`custom_label_2`)) {
        if (!(is.character(`custom_label_2`) && length(`custom_label_2`) == 1)) {
          stop(paste("Error! Invalid data for `custom_label_2`. Must be a string:", `custom_label_2`))
        }
        self$`custom_label_2` <- `custom_label_2`
      }
      if (!is.null(`custom_label_3`)) {
        if (!(is.character(`custom_label_3`) && length(`custom_label_3`) == 1)) {
          stop(paste("Error! Invalid data for `custom_label_3`. Must be a string:", `custom_label_3`))
        }
        self$`custom_label_3` <- `custom_label_3`
      }
      if (!is.null(`custom_label_4`)) {
        if (!(is.character(`custom_label_4`) && length(`custom_label_4`) == 1)) {
          stop(paste("Error! Invalid data for `custom_label_4`. Must be a string:", `custom_label_4`))
        }
        self$`custom_label_4` <- `custom_label_4`
      }
      if (!is.null(`visibility`)) {
        if (!(is.character(`visibility`) && length(`visibility`) == 1)) {
          stop(paste("Error! Invalid data for `visibility`. Must be a string:", `visibility`))
        }
        self$`visibility` <- `visibility`
      }
    },

    #' @description
    #' To JSON String
    #'
    #' @return CatalogsUpdatableCreativeAssetsAttributes in JSON format
    toJSON = function() {
      CatalogsUpdatableCreativeAssetsAttributesObject <- list()
      if (!is.null(self$`title`)) {
        CatalogsUpdatableCreativeAssetsAttributesObject[["title"]] <-
          self$`title`
      }
      if (!is.null(self$`description`)) {
        CatalogsUpdatableCreativeAssetsAttributesObject[["description"]] <-
          self$`description`
      }
      if (!is.null(self$`link`)) {
        CatalogsUpdatableCreativeAssetsAttributesObject[["link"]] <-
          self$`link`
      }
      if (!is.null(self$`ios_deep_link`)) {
        CatalogsUpdatableCreativeAssetsAttributesObject[["ios_deep_link"]] <-
          self$`ios_deep_link`
      }
      if (!is.null(self$`android_deep_link`)) {
        CatalogsUpdatableCreativeAssetsAttributesObject[["android_deep_link"]] <-
          self$`android_deep_link`
      }
      if (!is.null(self$`google_product_category`)) {
        CatalogsUpdatableCreativeAssetsAttributesObject[["google_product_category"]] <-
          self$`google_product_category`
      }
      if (!is.null(self$`custom_label_0`)) {
        CatalogsUpdatableCreativeAssetsAttributesObject[["custom_label_0"]] <-
          self$`custom_label_0`
      }
      if (!is.null(self$`custom_label_1`)) {
        CatalogsUpdatableCreativeAssetsAttributesObject[["custom_label_1"]] <-
          self$`custom_label_1`
      }
      if (!is.null(self$`custom_label_2`)) {
        CatalogsUpdatableCreativeAssetsAttributesObject[["custom_label_2"]] <-
          self$`custom_label_2`
      }
      if (!is.null(self$`custom_label_3`)) {
        CatalogsUpdatableCreativeAssetsAttributesObject[["custom_label_3"]] <-
          self$`custom_label_3`
      }
      if (!is.null(self$`custom_label_4`)) {
        CatalogsUpdatableCreativeAssetsAttributesObject[["custom_label_4"]] <-
          self$`custom_label_4`
      }
      if (!is.null(self$`visibility`)) {
        CatalogsUpdatableCreativeAssetsAttributesObject[["visibility"]] <-
          self$`visibility`
      }
      CatalogsUpdatableCreativeAssetsAttributesObject
    },

    #' @description
    #' Deserialize JSON string into an instance of CatalogsUpdatableCreativeAssetsAttributes
    #'
    #' @param input_json the JSON input
    #' @return the instance of CatalogsUpdatableCreativeAssetsAttributes
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`title`)) {
        self$`title` <- this_object$`title`
      }
      if (!is.null(this_object$`description`)) {
        self$`description` <- this_object$`description`
      }
      if (!is.null(this_object$`link`)) {
        self$`link` <- this_object$`link`
      }
      if (!is.null(this_object$`ios_deep_link`)) {
        self$`ios_deep_link` <- this_object$`ios_deep_link`
      }
      if (!is.null(this_object$`android_deep_link`)) {
        self$`android_deep_link` <- this_object$`android_deep_link`
      }
      if (!is.null(this_object$`google_product_category`)) {
        self$`google_product_category` <- this_object$`google_product_category`
      }
      if (!is.null(this_object$`custom_label_0`)) {
        self$`custom_label_0` <- this_object$`custom_label_0`
      }
      if (!is.null(this_object$`custom_label_1`)) {
        self$`custom_label_1` <- this_object$`custom_label_1`
      }
      if (!is.null(this_object$`custom_label_2`)) {
        self$`custom_label_2` <- this_object$`custom_label_2`
      }
      if (!is.null(this_object$`custom_label_3`)) {
        self$`custom_label_3` <- this_object$`custom_label_3`
      }
      if (!is.null(this_object$`custom_label_4`)) {
        self$`custom_label_4` <- this_object$`custom_label_4`
      }
      if (!is.null(this_object$`visibility`)) {
        self$`visibility` <- this_object$`visibility`
      }
      self
    },

    #' @description
    #' To JSON String
    #'
    #' @return CatalogsUpdatableCreativeAssetsAttributes in JSON format
    toJSONString = function() {
      jsoncontent <- c(
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
        if (!is.null(self$`link`)) {
          sprintf(
          '"link":
            "%s"
                    ',
          self$`link`
          )
        },
        if (!is.null(self$`ios_deep_link`)) {
          sprintf(
          '"ios_deep_link":
            "%s"
                    ',
          self$`ios_deep_link`
          )
        },
        if (!is.null(self$`android_deep_link`)) {
          sprintf(
          '"android_deep_link":
            "%s"
                    ',
          self$`android_deep_link`
          )
        },
        if (!is.null(self$`google_product_category`)) {
          sprintf(
          '"google_product_category":
            "%s"
                    ',
          self$`google_product_category`
          )
        },
        if (!is.null(self$`custom_label_0`)) {
          sprintf(
          '"custom_label_0":
            "%s"
                    ',
          self$`custom_label_0`
          )
        },
        if (!is.null(self$`custom_label_1`)) {
          sprintf(
          '"custom_label_1":
            "%s"
                    ',
          self$`custom_label_1`
          )
        },
        if (!is.null(self$`custom_label_2`)) {
          sprintf(
          '"custom_label_2":
            "%s"
                    ',
          self$`custom_label_2`
          )
        },
        if (!is.null(self$`custom_label_3`)) {
          sprintf(
          '"custom_label_3":
            "%s"
                    ',
          self$`custom_label_3`
          )
        },
        if (!is.null(self$`custom_label_4`)) {
          sprintf(
          '"custom_label_4":
            "%s"
                    ',
          self$`custom_label_4`
          )
        },
        if (!is.null(self$`visibility`)) {
          sprintf(
          '"visibility":
            "%s"
                    ',
          self$`visibility`
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },

    #' @description
    #' Deserialize JSON string into an instance of CatalogsUpdatableCreativeAssetsAttributes
    #'
    #' @param input_json the JSON input
    #' @return the instance of CatalogsUpdatableCreativeAssetsAttributes
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`title` <- this_object$`title`
      self$`description` <- this_object$`description`
      self$`link` <- this_object$`link`
      self$`ios_deep_link` <- this_object$`ios_deep_link`
      self$`android_deep_link` <- this_object$`android_deep_link`
      self$`google_product_category` <- this_object$`google_product_category`
      self$`custom_label_0` <- this_object$`custom_label_0`
      self$`custom_label_1` <- this_object$`custom_label_1`
      self$`custom_label_2` <- this_object$`custom_label_2`
      self$`custom_label_3` <- this_object$`custom_label_3`
      self$`custom_label_4` <- this_object$`custom_label_4`
      self$`visibility` <- this_object$`visibility`
      self
    },

    #' @description
    #' Validate JSON input with respect to CatalogsUpdatableCreativeAssetsAttributes and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of CatalogsUpdatableCreativeAssetsAttributes
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      TRUE
    },

    #' @description
    #' Return a list of invalid fields (if any).
    #'
    #' @return A list of invalid fields (if any).
    getInvalidFields = function() {
      invalid_fields <- list()
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
# CatalogsUpdatableCreativeAssetsAttributes$unlock()
#
## Below is an example to define the print function
# CatalogsUpdatableCreativeAssetsAttributes$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# CatalogsUpdatableCreativeAssetsAttributes$lock()

