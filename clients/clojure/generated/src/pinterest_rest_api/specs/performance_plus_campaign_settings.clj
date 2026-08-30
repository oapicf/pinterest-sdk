(ns pinterest-rest-api.specs.performance-plus-campaign-settings
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def performance-plus-campaign-settings-data
  {
   (ds/opt :boost_prospecting_ad_group_bid) boolean?
   (ds/opt :pinner_list_exclusions) (s/coll-of string?)
   })

(def performance-plus-campaign-settings-spec
  (ds/spec
    {:name ::performance-plus-campaign-settings
     :spec performance-plus-campaign-settings-data}))
