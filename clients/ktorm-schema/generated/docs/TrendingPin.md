
# Table `TrendingPin`
(mapped from: TrendingPin)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**color** | color | text NOT NULL |  | **kotlin.String** | Dominant color of the pin image in hex format | 
**height** | height | int NOT NULL |  | **kotlin.Int** | Height of the pin image in pixels | 
**id** | id | text NOT NULL PRIMARY KEY |  | **kotlin.String** | Unique identifier for the pin | 
**src** | src | text NOT NULL |  | **kotlin.String** | URL of the pin image | 
**width** | width | int NOT NULL |  | **kotlin.Int** | Width of the pin image in pixels | 
**verticalOffset** | vertical_offset | double |  | **kotlin.Double** | The vertical offset of the pin image as a percentage from 0 to 100, where 0 is the top of the image and 100 is the bottom. |  [optional]








