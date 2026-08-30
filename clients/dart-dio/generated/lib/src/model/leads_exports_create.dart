//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'leads_exports_create.g.dart';

/// Resource create operation model.
///
/// Properties:
/// * [adId] - ID for the ad collecting leads.
/// * [endDate] - Export leads collected on and before end date (UTC). Format: YYYY-MM-DD.
/// * [startDate] - Export leads collected on and after start date (UTC). Format: YYYY-MM-DD.
@BuiltValue()
abstract class LeadsExportsCreate implements Built<LeadsExportsCreate, LeadsExportsCreateBuilder> {
  /// ID for the ad collecting leads.
  @BuiltValueField(wireName: r'ad_id')
  String get adId;

  /// Export leads collected on and before end date (UTC). Format: YYYY-MM-DD.
  @BuiltValueField(wireName: r'end_date')
  String get endDate;

  /// Export leads collected on and after start date (UTC). Format: YYYY-MM-DD.
  @BuiltValueField(wireName: r'start_date')
  String get startDate;

  LeadsExportsCreate._();

  factory LeadsExportsCreate([void updates(LeadsExportsCreateBuilder b)]) = _$LeadsExportsCreate;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(LeadsExportsCreateBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<LeadsExportsCreate> get serializer => _$LeadsExportsCreateSerializer();
}

class _$LeadsExportsCreateSerializer implements PrimitiveSerializer<LeadsExportsCreate> {
  @override
  final Iterable<Type> types = const [LeadsExportsCreate, _$LeadsExportsCreate];

  @override
  final String wireName = r'LeadsExportsCreate';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    LeadsExportsCreate object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'ad_id';
    yield serializers.serialize(
      object.adId,
      specifiedType: const FullType(String),
    );
    yield r'end_date';
    yield serializers.serialize(
      object.endDate,
      specifiedType: const FullType(String),
    );
    yield r'start_date';
    yield serializers.serialize(
      object.startDate,
      specifiedType: const FullType(String),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    LeadsExportsCreate object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required LeadsExportsCreateBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'ad_id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.adId = valueDes;
          break;
        case r'end_date':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.endDate = valueDes;
          break;
        case r'start_date':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.startDate = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  LeadsExportsCreate deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = LeadsExportsCreateBuilder();
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

