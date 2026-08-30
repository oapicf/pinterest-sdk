(ns pinterest-rest-api.specs.campaign-bid-options-update-mask-items
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def campaign-bid-options-update-mask-items-data
  {
   })

(def campaign-bid-options-update-mask-items-spec
  (ds/spec
    {:name ::campaign-bid-options-update-mask-items
     :spec campaign-bid-options-update-mask-items-data}))
