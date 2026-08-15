//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'placement_multipliers.g.dart';

/// This represents a mapping from placement to a bid price adjustment.  Multiplier values must be between 0 and 10. A value of 10 represents a 900% increase in bid price (from $1 to $10 for example). A value of 0 will stop distribution for this item on the specified placement in `MAX_BID` ad groups in `CATALOG_SALES` campaigns. All placement multipliers must be set at the same time. If a multiplier is not provided it is assumed to be 1 (no bid adjustment).
///
/// Properties:
/// * [PLACEMENT] 
@BuiltValue()
abstract class PlacementMultipliers implements Built<PlacementMultipliers, PlacementMultipliersBuilder> {
  @BuiltValueField(wireName: r'PLACEMENT')
  PlacementMultipliersPLACEMENTEnum? get PLACEMENT;
  // enum PLACEMENTEnum {  SEARCH,  BROWSE,  RELATED_PINS,  };

  PlacementMultipliers._();

  factory PlacementMultipliers([void updates(PlacementMultipliersBuilder b)]) = _$PlacementMultipliers;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(PlacementMultipliersBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<PlacementMultipliers> get serializer => _$PlacementMultipliersSerializer();
}

class _$PlacementMultipliersSerializer implements PrimitiveSerializer<PlacementMultipliers> {
  @override
  final Iterable<Type> types = const [PlacementMultipliers, _$PlacementMultipliers];

  @override
  final String wireName = r'PlacementMultipliers';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    PlacementMultipliers object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.PLACEMENT != null) {
      yield r'PLACEMENT';
      yield serializers.serialize(
        object.PLACEMENT,
        specifiedType: const FullType(PlacementMultipliersPLACEMENTEnum),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    PlacementMultipliers object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required PlacementMultipliersBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'PLACEMENT':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(PlacementMultipliersPLACEMENTEnum),
          ) as PlacementMultipliersPLACEMENTEnum;
          result.PLACEMENT = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  PlacementMultipliers deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = PlacementMultipliersBuilder();
    final serializedList = (serialized as Iterable<Object?>).toList();
    final unhandled = <Object?>[];
    _deserializeProperties(
      serializers,
      serialized,
      specifiedType: specifiedType,
      serializedList: serializedList,
      unhandled: unhandled,
      result: result,
    );
    return result.build();
  }
}

class PlacementMultipliersPLACEMENTEnum extends EnumClass {

  @BuiltValueEnumConst(wireName: r'SEARCH')
  static const PlacementMultipliersPLACEMENTEnum SEARCH = _$placementMultipliersPLACEMENTEnum_SEARCH;
  @BuiltValueEnumConst(wireName: r'BROWSE')
  static const PlacementMultipliersPLACEMENTEnum BROWSE = _$placementMultipliersPLACEMENTEnum_BROWSE;
  @BuiltValueEnumConst(wireName: r'RELATED_PINS')
  static const PlacementMultipliersPLACEMENTEnum RELATED_PINS = _$placementMultipliersPLACEMENTEnum_RELATED_PINS;

  static Serializer<PlacementMultipliersPLACEMENTEnum> get serializer => _$placementMultipliersPLACEMENTEnumSerializer;

  const PlacementMultipliersPLACEMENTEnum._(String name): super(name);

  static BuiltSet<PlacementMultipliersPLACEMENTEnum> get values => _$placementMultipliersPLACEMENTEnumValues;
  static PlacementMultipliersPLACEMENTEnum valueOf(String name) => _$placementMultipliersPLACEMENTEnumValueOf(name);
}

