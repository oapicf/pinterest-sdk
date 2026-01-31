(ns pinterest-rest-api.specs.campaign-audience-multipliers
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def campaign-audience-multipliers-data
  {
   (ds/opt :AUDIENCE_ID) string?
   })

(def campaign-audience-multipliers-spec
  (ds/spec
    {:name ::campaign-audience-multipliers
     :spec campaign-audience-multipliers-data}))
