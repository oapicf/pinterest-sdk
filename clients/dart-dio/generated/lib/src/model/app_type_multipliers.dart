//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/targeting_spec_app_type.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'app_type_multipliers.g.dart';

/// This represents a mapping from app type targeting criteria to a bid price adjustment.  Multiplier values must be between 0 and 10. A value of 10 represents a 900% increase in bid price (from $1 to $10 for example). A value of 0 will stop distribution for this item on the specified app type in `MAX_BID` ad groups in `CATALOG_SALES` campaigns. All app type multipliers must be set at the same time. If a multiplier is not provided it is assumed to be 1 (no bid adjustment).
///
/// Properties:
/// * [APP_TYPE] - App type identifier.
@BuiltValue()
abstract class AppTypeMultipliers implements Built<AppTypeMultipliers, AppTypeMultipliersBuilder> {
  /// App type identifier.
  @BuiltValueField(wireName: r'APP_TYPE')
  TargetingSpecAppType? get APP_TYPE;
  // enum APP_TYPEEnum {  android_mobile,  android_tablet,  ipad,  iphone,  web,  web_mobile,  };

  AppTypeMultipliers._();

  factory AppTypeMultipliers([void updates(AppTypeMultipliersBuilder b)]) = _$AppTypeMultipliers;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(AppTypeMultipliersBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<AppTypeMultipliers> get serializer => _$AppTypeMultipliersSerializer();
}

class _$AppTypeMultipliersSerializer implements PrimitiveSerializer<AppTypeMultipliers> {
  @override
  final Iterable<Type> types = const [AppTypeMultipliers, _$AppTypeMultipliers];

  @override
  final String wireName = r'AppTypeMultipliers';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    AppTypeMultipliers object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.APP_TYPE != null) {
      yield r'APP_TYPE';
      yield serializers.serialize(
        object.APP_TYPE,
        specifiedType: const FullType(TargetingSpecAppType),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    AppTypeMultipliers object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required AppTypeMultipliersBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'APP_TYPE':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(TargetingSpecAppType),
          ) as TargetingSpecAppType?;
          if (valueDes == null) continue;
          result.APP_TYPE = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  AppTypeMultipliers deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = AppTypeMultipliersBuilder();
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

