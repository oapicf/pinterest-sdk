//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'campaign_bid_options_update_mask_items.g.dart';

class CampaignBidOptionsUpdateMaskItems extends EnumClass {

  /// Fields that can be updated in campaign bid options.
  @BuiltValueEnumConst(wireName: r'AUDIENCE')
  static const CampaignBidOptionsUpdateMaskItems AUDIENCE = _$AUDIENCE;
  /// Fields that can be updated in campaign bid options.
  @BuiltValueEnumConst(wireName: r'APP_TYPE')
  static const CampaignBidOptionsUpdateMaskItems APP_TYPE = _$APP_TYPE;
  /// Fields that can be updated in campaign bid options.
  @BuiltValueEnumConst(wireName: r'PLACEMENT')
  static const CampaignBidOptionsUpdateMaskItems PLACEMENT = _$PLACEMENT;
  /// Fields that can be updated in campaign bid options.
  @BuiltValueEnumConst(wireName: r'GENDER')
  static const CampaignBidOptionsUpdateMaskItems GENDER = _$GENDER;
  /// Fields that can be updated in campaign bid options.
  @BuiltValueEnumConst(wireName: r'AGE_BUCKET')
  static const CampaignBidOptionsUpdateMaskItems AGE_BUCKET = _$AGE_BUCKET;
  /// Fields that can be updated in campaign bid options.
  @BuiltValueEnumConst(wireName: r'FREQUENCY')
  static const CampaignBidOptionsUpdateMaskItems FREQUENCY = _$FREQUENCY;

  static Serializer<CampaignBidOptionsUpdateMaskItems> get serializer => _$campaignBidOptionsUpdateMaskItemsSerializer;

  const CampaignBidOptionsUpdateMaskItems._(String name): super(name);

  static BuiltSet<CampaignBidOptionsUpdateMaskItems> get values => _$values;
  static CampaignBidOptionsUpdateMaskItems valueOf(String name) => _$valueOf(name);
}

/// Optionally, enum_class can generate a mixin to go with your enum for use
/// with Angular. It exposes your enum constants as getters. So, if you mix it
/// in to your Dart component class, the values become available to the
/// corresponding Angular template.
///
/// Trigger mixin generation by writing a line like this one next to your enum.
abstract class CampaignBidOptionsUpdateMaskItemsMixin = Object with _$CampaignBidOptionsUpdateMaskItemsMixin;

