(ns pinterest-rest-api.specs.conversion-attribution-window-days
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def conversion-attribution-window-days-data
  {
   })

(def conversion-attribution-window-days-spec
  (ds/spec
    {:name ::conversion-attribution-window-days
     :spec conversion-attribution-window-days-data}))
