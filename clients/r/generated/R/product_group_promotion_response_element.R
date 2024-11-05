#' Create a new ProductGroupPromotionResponseElement
#'
#' @description
#' ProductGroupPromotionResponseElement Class
#'
#' @docType class
#' @title ProductGroupPromotionResponseElement
#' @description ProductGroupPromotionResponseElement Class
#' @format An \code{R6Class} generator object
#' @field id ID of the product group promotion. character [optional]
#' @field ad_group_id ID of the ad group the product group belongs to. character [optional]
#' @field bid_in_micro_currency The bid in micro currency. integer [optional]
#' @field included True if the group is BIDDABLE, false if it should be EXCLUDED from serving ads. character [optional]
#' @field definition The full product group definition path character [optional]
#' @field relative_definition The definition of the product group, relative to its parent - an attribute name/value pair character [optional]
#' @field parent_id The parent Product Group ID of this Product Group character [optional]
#' @field slideshow_collections_title Slideshow Collections Title character [optional]
#' @field slideshow_collections_description Slideshow Collections Description character [optional]
#' @field is_mdl If set to true products promoted in this product group will use the Mobile Deep Link specified in your catalog character [optional]
#' @field status  \link{EntityStatus} [optional]
#' @field tracking_url Tracking template for proudct group promotions. 4000 limit character [optional]
#' @field catalog_product_group_id ID of the catalogs product group that this product group promotion references character [optional]
#' @field catalog_product_group_name Catalogs product group name character [optional]
#' @field collections_hero_pin_id Hero Pin ID if this PG is promoted as a Collection character [optional]
#' @field collections_hero_destination_url Collections Hero Destination Url character [optional]
#' @field grid_click_type  \link{GridClickType} [optional]
#' @field creative_type  \link{CreativeType} [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
ProductGroupPromotionResponseElement <- R6::R6Class(
  "ProductGroupPromotionResponseElement",
  public = list(
    `id` = NULL,
    `ad_group_id` = NULL,
    `bid_in_micro_currency` = NULL,
    `included` = NULL,
    `definition` = NULL,
    `relative_definition` = NULL,
    `parent_id` = NULL,
    `slideshow_collections_title` = NULL,
    `slideshow_collections_description` = NULL,
    `is_mdl` = NULL,
    `status` = NULL,
    `tracking_url` = NULL,
    `catalog_product_group_id` = NULL,
    `catalog_product_group_name` = NULL,
    `collections_hero_pin_id` = NULL,
    `collections_hero_destination_url` = NULL,
    `grid_click_type` = NULL,
    `creative_type` = NULL,

    #' @description
    #' Initialize a new ProductGroupPromotionResponseElement class.
    #'
    #' @param id ID of the product group promotion.
    #' @param ad_group_id ID of the ad group the product group belongs to.
    #' @param bid_in_micro_currency The bid in micro currency.
    #' @param included True if the group is BIDDABLE, false if it should be EXCLUDED from serving ads.
    #' @param definition The full product group definition path
    #' @param relative_definition The definition of the product group, relative to its parent - an attribute name/value pair
    #' @param parent_id The parent Product Group ID of this Product Group
    #' @param slideshow_collections_title Slideshow Collections Title
    #' @param slideshow_collections_description Slideshow Collections Description
    #' @param is_mdl If set to true products promoted in this product group will use the Mobile Deep Link specified in your catalog
    #' @param status status
    #' @param tracking_url Tracking template for proudct group promotions. 4000 limit
    #' @param catalog_product_group_id ID of the catalogs product group that this product group promotion references
    #' @param catalog_product_group_name Catalogs product group name
    #' @param collections_hero_pin_id Hero Pin ID if this PG is promoted as a Collection
    #' @param collections_hero_destination_url Collections Hero Destination Url
    #' @param grid_click_type grid_click_type
    #' @param creative_type creative_type
    #' @param ... Other optional arguments.
    initialize = function(`id` = NULL, `ad_group_id` = NULL, `bid_in_micro_currency` = NULL, `included` = NULL, `definition` = NULL, `relative_definition` = NULL, `parent_id` = NULL, `slideshow_collections_title` = NULL, `slideshow_collections_description` = NULL, `is_mdl` = NULL, `status` = NULL, `tracking_url` = NULL, `catalog_product_group_id` = NULL, `catalog_product_group_name` = NULL, `collections_hero_pin_id` = NULL, `collections_hero_destination_url` = NULL, `grid_click_type` = NULL, `creative_type` = NULL, ...) {
      if (!is.null(`id`)) {
        if (!(is.character(`id`) && length(`id`) == 1)) {
          stop(paste("Error! Invalid data for `id`. Must be a string:", `id`))
        }
        self$`id` <- `id`
      }
      if (!is.null(`ad_group_id`)) {
        if (!(is.character(`ad_group_id`) && length(`ad_group_id`) == 1)) {
          stop(paste("Error! Invalid data for `ad_group_id`. Must be a string:", `ad_group_id`))
        }
        self$`ad_group_id` <- `ad_group_id`
      }
      if (!is.null(`bid_in_micro_currency`)) {
        if (!(is.numeric(`bid_in_micro_currency`) && length(`bid_in_micro_currency`) == 1)) {
          stop(paste("Error! Invalid data for `bid_in_micro_currency`. Must be an integer:", `bid_in_micro_currency`))
        }
        self$`bid_in_micro_currency` <- `bid_in_micro_currency`
      }
      if (!is.null(`included`)) {
        if (!(is.logical(`included`) && length(`included`) == 1)) {
          stop(paste("Error! Invalid data for `included`. Must be a boolean:", `included`))
        }
        self$`included` <- `included`
      }
      if (!is.null(`definition`)) {
        if (!(is.character(`definition`) && length(`definition`) == 1)) {
          stop(paste("Error! Invalid data for `definition`. Must be a string:", `definition`))
        }
        self$`definition` <- `definition`
      }
      if (!is.null(`relative_definition`)) {
        if (!(is.character(`relative_definition`) && length(`relative_definition`) == 1)) {
          stop(paste("Error! Invalid data for `relative_definition`. Must be a string:", `relative_definition`))
        }
        self$`relative_definition` <- `relative_definition`
      }
      if (!is.null(`parent_id`)) {
        if (!(is.character(`parent_id`) && length(`parent_id`) == 1)) {
          stop(paste("Error! Invalid data for `parent_id`. Must be a string:", `parent_id`))
        }
        self$`parent_id` <- `parent_id`
      }
      if (!is.null(`slideshow_collections_title`)) {
        if (!(is.character(`slideshow_collections_title`) && length(`slideshow_collections_title`) == 1)) {
          stop(paste("Error! Invalid data for `slideshow_collections_title`. Must be a string:", `slideshow_collections_title`))
        }
        self$`slideshow_collections_title` <- `slideshow_collections_title`
      }
      if (!is.null(`slideshow_collections_description`)) {
        if (!(is.character(`slideshow_collections_description`) && length(`slideshow_collections_description`) == 1)) {
          stop(paste("Error! Invalid data for `slideshow_collections_description`. Must be a string:", `slideshow_collections_description`))
        }
        self$`slideshow_collections_description` <- `slideshow_collections_description`
      }
      if (!is.null(`is_mdl`)) {
        if (!(is.logical(`is_mdl`) && length(`is_mdl`) == 1)) {
          stop(paste("Error! Invalid data for `is_mdl`. Must be a boolean:", `is_mdl`))
        }
        self$`is_mdl` <- `is_mdl`
      }
      if (!is.null(`status`)) {
        if (!(`status` %in% c())) {
          stop(paste("Error! \"", `status`, "\" cannot be assigned to `status`. Must be .", sep = ""))
        }
        stopifnot(R6::is.R6(`status`))
        self$`status` <- `status`
      }
      if (!is.null(`tracking_url`)) {
        if (!(is.character(`tracking_url`) && length(`tracking_url`) == 1)) {
          stop(paste("Error! Invalid data for `tracking_url`. Must be a string:", `tracking_url`))
        }
        self$`tracking_url` <- `tracking_url`
      }
      if (!is.null(`catalog_product_group_id`)) {
        if (!(is.character(`catalog_product_group_id`) && length(`catalog_product_group_id`) == 1)) {
          stop(paste("Error! Invalid data for `catalog_product_group_id`. Must be a string:", `catalog_product_group_id`))
        }
        self$`catalog_product_group_id` <- `catalog_product_group_id`
      }
      if (!is.null(`catalog_product_group_name`)) {
        if (!(is.character(`catalog_product_group_name`) && length(`catalog_product_group_name`) == 1)) {
          stop(paste("Error! Invalid data for `catalog_product_group_name`. Must be a string:", `catalog_product_group_name`))
        }
        self$`catalog_product_group_name` <- `catalog_product_group_name`
      }
      if (!is.null(`collections_hero_pin_id`)) {
        if (!(is.character(`collections_hero_pin_id`) && length(`collections_hero_pin_id`) == 1)) {
          stop(paste("Error! Invalid data for `collections_hero_pin_id`. Must be a string:", `collections_hero_pin_id`))
        }
        self$`collections_hero_pin_id` <- `collections_hero_pin_id`
      }
      if (!is.null(`collections_hero_destination_url`)) {
        if (!(is.character(`collections_hero_destination_url`) && length(`collections_hero_destination_url`) == 1)) {
          stop(paste("Error! Invalid data for `collections_hero_destination_url`. Must be a string:", `collections_hero_destination_url`))
        }
        self$`collections_hero_destination_url` <- `collections_hero_destination_url`
      }
      if (!is.null(`grid_click_type`)) {
        if (!(`grid_click_type` %in% c())) {
          stop(paste("Error! \"", `grid_click_type`, "\" cannot be assigned to `grid_click_type`. Must be .", sep = ""))
        }
        stopifnot(R6::is.R6(`grid_click_type`))
        self$`grid_click_type` <- `grid_click_type`
      }
      if (!is.null(`creative_type`)) {
        if (!(`creative_type` %in% c())) {
          stop(paste("Error! \"", `creative_type`, "\" cannot be assigned to `creative_type`. Must be .", sep = ""))
        }
        stopifnot(R6::is.R6(`creative_type`))
        self$`creative_type` <- `creative_type`
      }
    },

    #' @description
    #' To JSON String
    #'
    #' @return ProductGroupPromotionResponseElement in JSON format
    toJSON = function() {
      ProductGroupPromotionResponseElementObject <- list()
      if (!is.null(self$`id`)) {
        ProductGroupPromotionResponseElementObject[["id"]] <-
          self$`id`
      }
      if (!is.null(self$`ad_group_id`)) {
        ProductGroupPromotionResponseElementObject[["ad_group_id"]] <-
          self$`ad_group_id`
      }
      if (!is.null(self$`bid_in_micro_currency`)) {
        ProductGroupPromotionResponseElementObject[["bid_in_micro_currency"]] <-
          self$`bid_in_micro_currency`
      }
      if (!is.null(self$`included`)) {
        ProductGroupPromotionResponseElementObject[["included"]] <-
          self$`included`
      }
      if (!is.null(self$`definition`)) {
        ProductGroupPromotionResponseElementObject[["definition"]] <-
          self$`definition`
      }
      if (!is.null(self$`relative_definition`)) {
        ProductGroupPromotionResponseElementObject[["relative_definition"]] <-
          self$`relative_definition`
      }
      if (!is.null(self$`parent_id`)) {
        ProductGroupPromotionResponseElementObject[["parent_id"]] <-
          self$`parent_id`
      }
      if (!is.null(self$`slideshow_collections_title`)) {
        ProductGroupPromotionResponseElementObject[["slideshow_collections_title"]] <-
          self$`slideshow_collections_title`
      }
      if (!is.null(self$`slideshow_collections_description`)) {
        ProductGroupPromotionResponseElementObject[["slideshow_collections_description"]] <-
          self$`slideshow_collections_description`
      }
      if (!is.null(self$`is_mdl`)) {
        ProductGroupPromotionResponseElementObject[["is_mdl"]] <-
          self$`is_mdl`
      }
      if (!is.null(self$`status`)) {
        ProductGroupPromotionResponseElementObject[["status"]] <-
          self$`status`$toJSON()
      }
      if (!is.null(self$`tracking_url`)) {
        ProductGroupPromotionResponseElementObject[["tracking_url"]] <-
          self$`tracking_url`
      }
      if (!is.null(self$`catalog_product_group_id`)) {
        ProductGroupPromotionResponseElementObject[["catalog_product_group_id"]] <-
          self$`catalog_product_group_id`
      }
      if (!is.null(self$`catalog_product_group_name`)) {
        ProductGroupPromotionResponseElementObject[["catalog_product_group_name"]] <-
          self$`catalog_product_group_name`
      }
      if (!is.null(self$`collections_hero_pin_id`)) {
        ProductGroupPromotionResponseElementObject[["collections_hero_pin_id"]] <-
          self$`collections_hero_pin_id`
      }
      if (!is.null(self$`collections_hero_destination_url`)) {
        ProductGroupPromotionResponseElementObject[["collections_hero_destination_url"]] <-
          self$`collections_hero_destination_url`
      }
      if (!is.null(self$`grid_click_type`)) {
        ProductGroupPromotionResponseElementObject[["grid_click_type"]] <-
          self$`grid_click_type`$toJSON()
      }
      if (!is.null(self$`creative_type`)) {
        ProductGroupPromotionResponseElementObject[["creative_type"]] <-
          self$`creative_type`$toJSON()
      }
      ProductGroupPromotionResponseElementObject
    },

    #' @description
    #' Deserialize JSON string into an instance of ProductGroupPromotionResponseElement
    #'
    #' @param input_json the JSON input
    #' @return the instance of ProductGroupPromotionResponseElement
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`id`)) {
        self$`id` <- this_object$`id`
      }
      if (!is.null(this_object$`ad_group_id`)) {
        self$`ad_group_id` <- this_object$`ad_group_id`
      }
      if (!is.null(this_object$`bid_in_micro_currency`)) {
        self$`bid_in_micro_currency` <- this_object$`bid_in_micro_currency`
      }
      if (!is.null(this_object$`included`)) {
        self$`included` <- this_object$`included`
      }
      if (!is.null(this_object$`definition`)) {
        self$`definition` <- this_object$`definition`
      }
      if (!is.null(this_object$`relative_definition`)) {
        self$`relative_definition` <- this_object$`relative_definition`
      }
      if (!is.null(this_object$`parent_id`)) {
        self$`parent_id` <- this_object$`parent_id`
      }
      if (!is.null(this_object$`slideshow_collections_title`)) {
        self$`slideshow_collections_title` <- this_object$`slideshow_collections_title`
      }
      if (!is.null(this_object$`slideshow_collections_description`)) {
        self$`slideshow_collections_description` <- this_object$`slideshow_collections_description`
      }
      if (!is.null(this_object$`is_mdl`)) {
        self$`is_mdl` <- this_object$`is_mdl`
      }
      if (!is.null(this_object$`status`)) {
        `status_object` <- EntityStatus$new()
        `status_object`$fromJSON(jsonlite::toJSON(this_object$`status`, auto_unbox = TRUE, digits = NA))
        self$`status` <- `status_object`
      }
      if (!is.null(this_object$`tracking_url`)) {
        self$`tracking_url` <- this_object$`tracking_url`
      }
      if (!is.null(this_object$`catalog_product_group_id`)) {
        self$`catalog_product_group_id` <- this_object$`catalog_product_group_id`
      }
      if (!is.null(this_object$`catalog_product_group_name`)) {
        self$`catalog_product_group_name` <- this_object$`catalog_product_group_name`
      }
      if (!is.null(this_object$`collections_hero_pin_id`)) {
        self$`collections_hero_pin_id` <- this_object$`collections_hero_pin_id`
      }
      if (!is.null(this_object$`collections_hero_destination_url`)) {
        self$`collections_hero_destination_url` <- this_object$`collections_hero_destination_url`
      }
      if (!is.null(this_object$`grid_click_type`)) {
        `grid_click_type_object` <- GridClickType$new()
        `grid_click_type_object`$fromJSON(jsonlite::toJSON(this_object$`grid_click_type`, auto_unbox = TRUE, digits = NA))
        self$`grid_click_type` <- `grid_click_type_object`
      }
      if (!is.null(this_object$`creative_type`)) {
        `creative_type_object` <- CreativeType$new()
        `creative_type_object`$fromJSON(jsonlite::toJSON(this_object$`creative_type`, auto_unbox = TRUE, digits = NA))
        self$`creative_type` <- `creative_type_object`
      }
      self
    },

    #' @description
    #' To JSON String
    #'
    #' @return ProductGroupPromotionResponseElement in JSON format
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
        if (!is.null(self$`ad_group_id`)) {
          sprintf(
          '"ad_group_id":
            "%s"
                    ',
          self$`ad_group_id`
          )
        },
        if (!is.null(self$`bid_in_micro_currency`)) {
          sprintf(
          '"bid_in_micro_currency":
            %d
                    ',
          self$`bid_in_micro_currency`
          )
        },
        if (!is.null(self$`included`)) {
          sprintf(
          '"included":
            %s
                    ',
          tolower(self$`included`)
          )
        },
        if (!is.null(self$`definition`)) {
          sprintf(
          '"definition":
            "%s"
                    ',
          self$`definition`
          )
        },
        if (!is.null(self$`relative_definition`)) {
          sprintf(
          '"relative_definition":
            "%s"
                    ',
          self$`relative_definition`
          )
        },
        if (!is.null(self$`parent_id`)) {
          sprintf(
          '"parent_id":
            "%s"
                    ',
          self$`parent_id`
          )
        },
        if (!is.null(self$`slideshow_collections_title`)) {
          sprintf(
          '"slideshow_collections_title":
            "%s"
                    ',
          self$`slideshow_collections_title`
          )
        },
        if (!is.null(self$`slideshow_collections_description`)) {
          sprintf(
          '"slideshow_collections_description":
            "%s"
                    ',
          self$`slideshow_collections_description`
          )
        },
        if (!is.null(self$`is_mdl`)) {
          sprintf(
          '"is_mdl":
            %s
                    ',
          tolower(self$`is_mdl`)
          )
        },
        if (!is.null(self$`status`)) {
          sprintf(
          '"status":
          %s
          ',
          jsonlite::toJSON(self$`status`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        },
        if (!is.null(self$`tracking_url`)) {
          sprintf(
          '"tracking_url":
            "%s"
                    ',
          self$`tracking_url`
          )
        },
        if (!is.null(self$`catalog_product_group_id`)) {
          sprintf(
          '"catalog_product_group_id":
            "%s"
                    ',
          self$`catalog_product_group_id`
          )
        },
        if (!is.null(self$`catalog_product_group_name`)) {
          sprintf(
          '"catalog_product_group_name":
            "%s"
                    ',
          self$`catalog_product_group_name`
          )
        },
        if (!is.null(self$`collections_hero_pin_id`)) {
          sprintf(
          '"collections_hero_pin_id":
            "%s"
                    ',
          self$`collections_hero_pin_id`
          )
        },
        if (!is.null(self$`collections_hero_destination_url`)) {
          sprintf(
          '"collections_hero_destination_url":
            "%s"
                    ',
          self$`collections_hero_destination_url`
          )
        },
        if (!is.null(self$`grid_click_type`)) {
          sprintf(
          '"grid_click_type":
          %s
          ',
          jsonlite::toJSON(self$`grid_click_type`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        },
        if (!is.null(self$`creative_type`)) {
          sprintf(
          '"creative_type":
          %s
          ',
          jsonlite::toJSON(self$`creative_type`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },

    #' @description
    #' Deserialize JSON string into an instance of ProductGroupPromotionResponseElement
    #'
    #' @param input_json the JSON input
    #' @return the instance of ProductGroupPromotionResponseElement
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`id` <- this_object$`id`
      self$`ad_group_id` <- this_object$`ad_group_id`
      self$`bid_in_micro_currency` <- this_object$`bid_in_micro_currency`
      self$`included` <- this_object$`included`
      self$`definition` <- this_object$`definition`
      self$`relative_definition` <- this_object$`relative_definition`
      self$`parent_id` <- this_object$`parent_id`
      self$`slideshow_collections_title` <- this_object$`slideshow_collections_title`
      self$`slideshow_collections_description` <- this_object$`slideshow_collections_description`
      self$`is_mdl` <- this_object$`is_mdl`
      self$`status` <- EntityStatus$new()$fromJSON(jsonlite::toJSON(this_object$`status`, auto_unbox = TRUE, digits = NA))
      self$`tracking_url` <- this_object$`tracking_url`
      self$`catalog_product_group_id` <- this_object$`catalog_product_group_id`
      self$`catalog_product_group_name` <- this_object$`catalog_product_group_name`
      self$`collections_hero_pin_id` <- this_object$`collections_hero_pin_id`
      self$`collections_hero_destination_url` <- this_object$`collections_hero_destination_url`
      self$`grid_click_type` <- GridClickType$new()$fromJSON(jsonlite::toJSON(this_object$`grid_click_type`, auto_unbox = TRUE, digits = NA))
      self$`creative_type` <- CreativeType$new()$fromJSON(jsonlite::toJSON(this_object$`creative_type`, auto_unbox = TRUE, digits = NA))
      self
    },

    #' @description
    #' Validate JSON input with respect to ProductGroupPromotionResponseElement and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of ProductGroupPromotionResponseElement
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      if (!str_detect(self$`id`, "^\\d+$")) {
        return(FALSE)
      }

      if (!str_detect(self$`ad_group_id`, "^(AG)?\\d+$")) {
        return(FALSE)
      }

      if (!str_detect(self$`parent_id`, "^\\d+$")) {
        return(FALSE)
      }

      if (!str_detect(self$`catalog_product_group_id`, "^\\d+$")) {
        return(FALSE)
      }

      if (!str_detect(self$`collections_hero_pin_id`, "^\\d+$")) {
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
      if (!str_detect(self$`id`, "^\\d+$")) {
        invalid_fields["id"] <- "Invalid value for `id`, must conform to the pattern ^\\d+$."
      }

      if (!str_detect(self$`ad_group_id`, "^(AG)?\\d+$")) {
        invalid_fields["ad_group_id"] <- "Invalid value for `ad_group_id`, must conform to the pattern ^(AG)?\\d+$."
      }

      if (!str_detect(self$`parent_id`, "^\\d+$")) {
        invalid_fields["parent_id"] <- "Invalid value for `parent_id`, must conform to the pattern ^\\d+$."
      }

      if (!str_detect(self$`catalog_product_group_id`, "^\\d+$")) {
        invalid_fields["catalog_product_group_id"] <- "Invalid value for `catalog_product_group_id`, must conform to the pattern ^\\d+$."
      }

      if (!str_detect(self$`collections_hero_pin_id`, "^\\d+$")) {
        invalid_fields["collections_hero_pin_id"] <- "Invalid value for `collections_hero_pin_id`, must conform to the pattern ^\\d+$."
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
# ProductGroupPromotionResponseElement$unlock()
#
## Below is an example to define the print function
# ProductGroupPromotionResponseElement$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# ProductGroupPromotionResponseElement$lock()

